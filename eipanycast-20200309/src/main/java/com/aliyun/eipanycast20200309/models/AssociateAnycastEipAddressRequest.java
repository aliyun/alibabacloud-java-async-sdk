// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link AssociateAnycastEipAddressRequest} extends {@link RequestModel}
 *
 * <p>AssociateAnycastEipAddressRequest</p>
 */
public class AssociateAnycastEipAddressRequest extends Request {
    @Query
    @NameInMap("AnycastId")
    private String anycastId;

    @Query
    @NameInMap("AssociationMode")
    private String associationMode;

    @Query
    @NameInMap("BindInstanceId")
    private String bindInstanceId;

    @Query
    @NameInMap("BindInstanceRegionId")
    private String bindInstanceRegionId;

    @Query
    @NameInMap("BindInstanceType")
    private String bindInstanceType;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("PopLocations")
    private java.util.List < PopLocations> popLocations;

    @Query
    @NameInMap("PrivateIpAddress")
    private String privateIpAddress;


    private AssociateAnycastEipAddressRequest(Builder builder) {
        super(builder);
        this.anycastId = builder.anycastId;
        this.associationMode = builder.associationMode;
        this.bindInstanceId = builder.bindInstanceId;
        this.bindInstanceRegionId = builder.bindInstanceRegionId;
        this.bindInstanceType = builder.bindInstanceType;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.popLocations = builder.popLocations;
        this.privateIpAddress = builder.privateIpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateAnycastEipAddressRequest create() {
        return builder().build();
    }

    /**
     * @return anycastId
     */
    public String getAnycastId() {
        return this.anycastId;
    }

    /**
     * @return associationMode
     */
    public String getAssociationMode() {
        return this.associationMode;
    }

    /**
     * @return bindInstanceId
     */
    public String getBindInstanceId() {
        return this.bindInstanceId;
    }

    /**
     * @return bindInstanceRegionId
     */
    public String getBindInstanceRegionId() {
        return this.bindInstanceRegionId;
    }

    /**
     * @return bindInstanceType
     */
    public String getBindInstanceType() {
        return this.bindInstanceType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return popLocations
     */
    public java.util.List < PopLocations> getPopLocations() {
        return this.popLocations;
    }

    /**
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String anycastId; 
        private String associationMode; 
        private String bindInstanceId; 
        private String bindInstanceRegionId; 
        private String bindInstanceType; 
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List < PopLocations> popLocations; 
        private String privateIpAddress; 

        /**
         * <p>AnycastId.</p>
         */
        public Builder anycastId(String anycastId) {
            this.putQueryParameter("AnycastId", anycastId);
            this.anycastId = anycastId;
            return this;
        }

        /**
         * <p>关联模式，默认模式、普通模式Default/Normal</p>
         */
        public Builder associationMode(String associationMode) {
            this.putQueryParameter("AssociationMode", associationMode);
            this.associationMode = associationMode;
            return this;
        }

        /**
         * <p>BindInstanceId.</p>
         */
        public Builder bindInstanceId(String bindInstanceId) {
            this.putQueryParameter("BindInstanceId", bindInstanceId);
            this.bindInstanceId = bindInstanceId;
            return this;
        }

        /**
         * <p>BindInstanceRegionId.</p>
         */
        public Builder bindInstanceRegionId(String bindInstanceRegionId) {
            this.putQueryParameter("BindInstanceRegionId", bindInstanceRegionId);
            this.bindInstanceRegionId = bindInstanceRegionId;
            return this;
        }

        /**
         * <p>BindInstanceType.</p>
         */
        public Builder bindInstanceType(String bindInstanceType) {
            this.putQueryParameter("BindInstanceType", bindInstanceType);
            this.bindInstanceType = bindInstanceType;
            return this;
        }

        /**
         * <p>ClientToken.</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>DryRun.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>绑定时关联的pop location，如果是绑定的第一个实例，该参数会忽略，会下发到全部pop点</p>
         */
        public Builder popLocations(java.util.List < PopLocations> popLocations) {
            this.putQueryParameter("PopLocations", popLocations);
            this.popLocations = popLocations;
            return this;
        }

        /**
         * <p>私网ip地址</p>
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        public AssociateAnycastEipAddressRequest build() {
            return new AssociateAnycastEipAddressRequest(this);
        } 

    } 

    public static class PopLocations extends TeaModel {
        @NameInMap("PopLocation")
        private String popLocation;


        private PopLocations(Builder builder) {
            this.popLocation = builder.popLocation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PopLocations create() {
            return builder().build();
        }

        /**
         * @return popLocation
         */
        public String getPopLocation() {
            return this.popLocation;
        }

        public static final class Builder {
            private String popLocation; 

            /**
             * <p>pop location</p>
             */
            public Builder popLocation(String popLocation) {
                this.popLocation = popLocation;
                return this;
            }

            public PopLocations build() {
                return new PopLocations(this);
            } 

        } 

    }
}
