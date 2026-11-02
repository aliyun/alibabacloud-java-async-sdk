// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListGatewayApiGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListGatewayApiGroupsResponseBody</p>
 */
public class ListGatewayApiGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("ApiGroups")
    private java.util.List<ApiGroups> apiGroups;

    @com.aliyun.core.annotation.NameInMap("ErrorField")
    private String errorField;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private ListGatewayApiGroupsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.apiGroups = builder.apiGroups;
        this.errorField = builder.errorField;
        this.httpStatusCode = builder.httpStatusCode;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayApiGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return apiGroups
     */
    public java.util.List<ApiGroups> getApiGroups() {
        return this.apiGroups;
    }

    /**
     * @return errorField
     */
    public String getErrorField() {
        return this.errorField;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private java.util.List<ApiGroups> apiGroups; 
        private String errorField; 
        private Integer httpStatusCode; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 
        private Boolean success; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListGatewayApiGroupsResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.apiGroups = model.apiGroups;
            this.errorField = model.errorField;
            this.httpStatusCode = model.httpStatusCode;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultMessage = model.resultMessage;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * ApiGroups.
         */
        public Builder apiGroups(java.util.List<ApiGroups> apiGroups) {
            this.apiGroups = apiGroups;
            return this;
        }

        /**
         * ErrorField.
         */
        public Builder errorField(String errorField) {
            this.errorField = errorField;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListGatewayApiGroupsResponseBody build() {
            return new ListGatewayApiGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGatewayApiGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayApiGroupsResponseBody</p>
     */
    public static class ApiGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Centers")
        private java.util.Map<String, ?> centers;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("EnableMTLS")
        private Boolean enableMTLS;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("HttpsModel")
        private Boolean httpsModel;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstancePort")
        private Integer instancePort;

        @com.aliyun.core.annotation.NameInMap("RegionMode")
        private Boolean regionMode;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Integer timeout;

        @com.aliyun.core.annotation.NameInMap("UpstreamType")
        private String upstreamType;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcModel")
        private Boolean vpcModel;

        private ApiGroups(Builder builder) {
            this.centers = builder.centers;
            this.description = builder.description;
            this.domainName = builder.domainName;
            this.enableMTLS = builder.enableMTLS;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.host = builder.host;
            this.httpsModel = builder.httpsModel;
            this.instanceId = builder.instanceId;
            this.instancePort = builder.instancePort;
            this.regionMode = builder.regionMode;
            this.timeout = builder.timeout;
            this.upstreamType = builder.upstreamType;
            this.vpcId = builder.vpcId;
            this.vpcModel = builder.vpcModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiGroups create() {
            return builder().build();
        }

        /**
         * @return centers
         */
        public java.util.Map<String, ?> getCenters() {
            return this.centers;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return enableMTLS
         */
        public Boolean getEnableMTLS() {
            return this.enableMTLS;
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return httpsModel
         */
        public Boolean getHttpsModel() {
            return this.httpsModel;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instancePort
         */
        public Integer getInstancePort() {
            return this.instancePort;
        }

        /**
         * @return regionMode
         */
        public Boolean getRegionMode() {
            return this.regionMode;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        /**
         * @return upstreamType
         */
        public String getUpstreamType() {
            return this.upstreamType;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcModel
         */
        public Boolean getVpcModel() {
            return this.vpcModel;
        }

        public static final class Builder {
            private java.util.Map<String, ?> centers; 
            private String description; 
            private String domainName; 
            private Boolean enableMTLS; 
            private Long groupId; 
            private String groupName; 
            private String host; 
            private Boolean httpsModel; 
            private String instanceId; 
            private Integer instancePort; 
            private Boolean regionMode; 
            private Integer timeout; 
            private String upstreamType; 
            private String vpcId; 
            private Boolean vpcModel; 

            private Builder() {
            } 

            private Builder(ApiGroups model) {
                this.centers = model.centers;
                this.description = model.description;
                this.domainName = model.domainName;
                this.enableMTLS = model.enableMTLS;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.host = model.host;
                this.httpsModel = model.httpsModel;
                this.instanceId = model.instanceId;
                this.instancePort = model.instancePort;
                this.regionMode = model.regionMode;
                this.timeout = model.timeout;
                this.upstreamType = model.upstreamType;
                this.vpcId = model.vpcId;
                this.vpcModel = model.vpcModel;
            } 

            /**
             * Centers.
             */
            public Builder centers(java.util.Map<String, ?> centers) {
                this.centers = centers;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * EnableMTLS.
             */
            public Builder enableMTLS(Boolean enableMTLS) {
                this.enableMTLS = enableMTLS;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * Host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * HttpsModel.
             */
            public Builder httpsModel(Boolean httpsModel) {
                this.httpsModel = httpsModel;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstancePort.
             */
            public Builder instancePort(Integer instancePort) {
                this.instancePort = instancePort;
                return this;
            }

            /**
             * RegionMode.
             */
            public Builder regionMode(Boolean regionMode) {
                this.regionMode = regionMode;
                return this;
            }

            /**
             * Timeout.
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * UpstreamType.
             */
            public Builder upstreamType(String upstreamType) {
                this.upstreamType = upstreamType;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VpcModel.
             */
            public Builder vpcModel(Boolean vpcModel) {
                this.vpcModel = vpcModel;
                return this;
            }

            public ApiGroups build() {
                return new ApiGroups(this);
            } 

        } 

    }
}
