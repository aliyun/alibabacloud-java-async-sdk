// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link UpdateAnycastEipAddressAssociationsRequest} extends {@link RequestModel}
 *
 * <p>UpdateAnycastEipAddressAssociationsRequest</p>
 */
public class UpdateAnycastEipAddressAssociationsRequest extends Request {
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
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("PopLocationAddList")
    private java.util.List < PopLocationAddList> popLocationAddList;

    @Query
    @NameInMap("PopLocationDeleteList")
    private java.util.List < PopLocationDeleteList> popLocationDeleteList;


    private UpdateAnycastEipAddressAssociationsRequest(Builder builder) {
        super(builder);
        this.anycastId = builder.anycastId;
        this.associationMode = builder.associationMode;
        this.bindInstanceId = builder.bindInstanceId;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.popLocationAddList = builder.popLocationAddList;
        this.popLocationDeleteList = builder.popLocationDeleteList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAnycastEipAddressAssociationsRequest create() {
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
     * @return popLocationAddList
     */
    public java.util.List < PopLocationAddList> getPopLocationAddList() {
        return this.popLocationAddList;
    }

    /**
     * @return popLocationDeleteList
     */
    public java.util.List < PopLocationDeleteList> getPopLocationDeleteList() {
        return this.popLocationDeleteList;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String anycastId; 
        private String associationMode; 
        private String bindInstanceId; 
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List < PopLocationAddList> popLocationAddList; 
        private java.util.List < PopLocationDeleteList> popLocationDeleteList; 

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
         * <p>新增关联的pop location</p>
         */
        public Builder popLocationAddList(java.util.List < PopLocationAddList> popLocationAddList) {
            this.putQueryParameter("PopLocationAddList", popLocationAddList);
            this.popLocationAddList = popLocationAddList;
            return this;
        }

        /**
         * <p>待删除的关联pop location</p>
         */
        public Builder popLocationDeleteList(java.util.List < PopLocationDeleteList> popLocationDeleteList) {
            this.putQueryParameter("PopLocationDeleteList", popLocationDeleteList);
            this.popLocationDeleteList = popLocationDeleteList;
            return this;
        }

        public UpdateAnycastEipAddressAssociationsRequest build() {
            return new UpdateAnycastEipAddressAssociationsRequest(this);
        } 

    } 

    public static class PopLocationAddList extends TeaModel {
        @NameInMap("PopLocation")
        private String popLocation;


        private PopLocationAddList(Builder builder) {
            this.popLocation = builder.popLocation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PopLocationAddList create() {
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

            public PopLocationAddList build() {
                return new PopLocationAddList(this);
            } 

        } 

    }
    public static class PopLocationDeleteList extends TeaModel {
        @NameInMap("PopLocation")
        private String popLocation;


        private PopLocationDeleteList(Builder builder) {
            this.popLocation = builder.popLocation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PopLocationDeleteList create() {
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

            public PopLocationDeleteList build() {
                return new PopLocationDeleteList(this);
            } 

        } 

    }
}
