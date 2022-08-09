// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAnycastEipAddressAssociationsRequest} extends {@link RequestModel}
 *
 * <p>UpdateAnycastEipAddressAssociationsRequest</p>
 */
public class UpdateAnycastEipAddressAssociationsRequest extends Request {
    @Query
    @NameInMap("AnycastId")
    @Validation(required = true)
    private String anycastId;

    @Query
    @NameInMap("AssociationMode")
    private String associationMode;

    @Query
    @NameInMap("BindInstanceId")
    @Validation(required = true)
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

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<UpdateAnycastEipAddressAssociationsRequest, Builder> {
        private String anycastId; 
        private String associationMode; 
        private String bindInstanceId; 
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List < PopLocationAddList> popLocationAddList; 
        private java.util.List < PopLocationDeleteList> popLocationDeleteList; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAnycastEipAddressAssociationsRequest request) {
            super(request);
            this.anycastId = request.anycastId;
            this.associationMode = request.associationMode;
            this.bindInstanceId = request.bindInstanceId;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.popLocationAddList = request.popLocationAddList;
            this.popLocationDeleteList = request.popLocationDeleteList;
        } 

        /**
         * AnycastId.
         */
        public Builder anycastId(String anycastId) {
            this.putQueryParameter("AnycastId", anycastId);
            this.anycastId = anycastId;
            return this;
        }

        /**
         * 关联模式，默认模式、普通模式Default/Normal
         */
        public Builder associationMode(String associationMode) {
            this.putQueryParameter("AssociationMode", associationMode);
            this.associationMode = associationMode;
            return this;
        }

        /**
         * BindInstanceId.
         */
        public Builder bindInstanceId(String bindInstanceId) {
            this.putQueryParameter("BindInstanceId", bindInstanceId);
            this.bindInstanceId = bindInstanceId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * 新增关联的pop location
         */
        public Builder popLocationAddList(java.util.List < PopLocationAddList> popLocationAddList) {
            this.putQueryParameter("PopLocationAddList", popLocationAddList);
            this.popLocationAddList = popLocationAddList;
            return this;
        }

        /**
         * 待删除的关联pop location
         */
        public Builder popLocationDeleteList(java.util.List < PopLocationDeleteList> popLocationDeleteList) {
            this.putQueryParameter("PopLocationDeleteList", popLocationDeleteList);
            this.popLocationDeleteList = popLocationDeleteList;
            return this;
        }

        @Override
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
             * pop location
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
             * pop location
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
