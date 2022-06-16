// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitInfoRequest} extends {@link RequestModel}
 *
 * <p>SubmitInfoRequest</p>
 */
public class SubmitInfoRequest extends Request {
    @Query
    @NameInMap("CallerUid")
    @Validation(maximum = 999999999999999D)
    private Long callerUid;

    @Body
    @NameInMap("EcsDescList")
    @Validation(required = true)
    private java.util.List < EcsDescList> ecsDescList;

    @Query
    @NameInMap("MainUserId")
    @Validation(required = true, maximum = 999999999999999D)
    private Long mainUserId;

    @Query
    @NameInMap("RequestId")
    private String requestId;

    private SubmitInfoRequest(Builder builder) {
        super(builder);
        this.callerUid = builder.callerUid;
        this.ecsDescList = builder.ecsDescList;
        this.mainUserId = builder.mainUserId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callerUid
     */
    public Long getCallerUid() {
        return this.callerUid;
    }

    /**
     * @return ecsDescList
     */
    public java.util.List < EcsDescList> getEcsDescList() {
        return this.ecsDescList;
    }

    /**
     * @return mainUserId
     */
    public Long getMainUserId() {
        return this.mainUserId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder extends Request.Builder<SubmitInfoRequest, Builder> {
        private Long callerUid; 
        private java.util.List < EcsDescList> ecsDescList; 
        private Long mainUserId; 
        private String requestId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitInfoRequest request) {
            super(request);
            this.callerUid = request.callerUid;
            this.ecsDescList = request.ecsDescList;
            this.mainUserId = request.mainUserId;
            this.requestId = request.requestId;
        } 

        /**
         * CallerUid.
         */
        public Builder callerUid(Long callerUid) {
            this.putQueryParameter("CallerUid", callerUid);
            this.callerUid = callerUid;
            return this;
        }

        /**
         * EcsDescList.
         */
        public Builder ecsDescList(java.util.List < EcsDescList> ecsDescList) {
            this.putBodyParameter("EcsDescList", ecsDescList);
            this.ecsDescList = ecsDescList;
            return this;
        }

        /**
         * MainUserId.
         */
        public Builder mainUserId(Long mainUserId) {
            this.putQueryParameter("MainUserId", mainUserId);
            this.mainUserId = mainUserId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        @Override
        public SubmitInfoRequest build() {
            return new SubmitInfoRequest(this);
        } 

    } 

    public static class EcsDescList extends TeaModel {
        @NameInMap("AppType")
        @Validation(required = true)
        private String appType;

        @NameInMap("BussinessDesc")
        private String bussinessDesc;

        @NameInMap("BussinessType")
        @Validation(required = true)
        private String bussinessType;

        @NameInMap("EnvType")
        @Validation(required = true)
        private String envType;

        @NameInMap("MiddleWareDesc")
        @Validation(required = true)
        private String middleWareDesc;

        @NameInMap("OtherMiddleWareDesc")
        private String otherMiddleWareDesc;

        @NameInMap("ResourceId")
        @Validation(required = true)
        private String resourceId;

        @NameInMap("UserId")
        private String userId;

        private EcsDescList(Builder builder) {
            this.appType = builder.appType;
            this.bussinessDesc = builder.bussinessDesc;
            this.bussinessType = builder.bussinessType;
            this.envType = builder.envType;
            this.middleWareDesc = builder.middleWareDesc;
            this.otherMiddleWareDesc = builder.otherMiddleWareDesc;
            this.resourceId = builder.resourceId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsDescList create() {
            return builder().build();
        }

        /**
         * @return appType
         */
        public String getAppType() {
            return this.appType;
        }

        /**
         * @return bussinessDesc
         */
        public String getBussinessDesc() {
            return this.bussinessDesc;
        }

        /**
         * @return bussinessType
         */
        public String getBussinessType() {
            return this.bussinessType;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return middleWareDesc
         */
        public String getMiddleWareDesc() {
            return this.middleWareDesc;
        }

        /**
         * @return otherMiddleWareDesc
         */
        public String getOtherMiddleWareDesc() {
            return this.otherMiddleWareDesc;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String appType; 
            private String bussinessDesc; 
            private String bussinessType; 
            private String envType; 
            private String middleWareDesc; 
            private String otherMiddleWareDesc; 
            private String resourceId; 
            private String userId; 

            /**
             * AppType.
             */
            public Builder appType(String appType) {
                this.appType = appType;
                return this;
            }

            /**
             * BussinessDesc.
             */
            public Builder bussinessDesc(String bussinessDesc) {
                this.bussinessDesc = bussinessDesc;
                return this;
            }

            /**
             * BussinessType.
             */
            public Builder bussinessType(String bussinessType) {
                this.bussinessType = bussinessType;
                return this;
            }

            /**
             * EnvType.
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * MiddleWareDesc.
             */
            public Builder middleWareDesc(String middleWareDesc) {
                this.middleWareDesc = middleWareDesc;
                return this;
            }

            /**
             * OtherMiddleWareDesc.
             */
            public Builder otherMiddleWareDesc(String otherMiddleWareDesc) {
                this.otherMiddleWareDesc = otherMiddleWareDesc;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public EcsDescList build() {
                return new EcsDescList(this);
            } 

        } 

    }
}
