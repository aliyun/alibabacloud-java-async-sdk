// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListServicesResponseBody</p>
 */
public class ListServicesResponseBody extends TeaModel {
    @NameInMap("ModelServices")
    private java.util.List < ModelServices> modelServices;

    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    private ListServicesResponseBody(Builder builder) {
        this.modelServices = builder.modelServices;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return modelServices
     */
    public java.util.List < ModelServices> getModelServices() {
        return this.modelServices;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < ModelServices> modelServices; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 

        /**
         * ModelServices.
         */
        public Builder modelServices(java.util.List < ModelServices> modelServices) {
            this.modelServices = modelServices;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListServicesResponseBody build() {
            return new ListServicesResponseBody(this);
        } 

    } 

    public static class ModelServices extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("ModelServiceId")
        private String modelServiceId;

        @NameInMap("Status")
        private String status;

        private ModelServices(Builder builder) {
            this.appId = builder.appId;
            this.modelServiceId = builder.modelServiceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelServices create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return modelServiceId
         */
        public String getModelServiceId() {
            return this.modelServiceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String appId; 
            private String modelServiceId; 
            private String status; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * ModelServiceId.
             */
            public Builder modelServiceId(String modelServiceId) {
                this.modelServiceId = modelServiceId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ModelServices build() {
                return new ModelServices(this);
            } 

        } 

    }
}
