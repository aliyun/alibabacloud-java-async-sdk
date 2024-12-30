// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetMyTenantsResponseBody} extends {@link TeaModel}
 *
 * <p>GetMyTenantsResponseBody</p>
 */
public class GetMyTenantsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TenantList")
    private java.util.List<TenantList> tenantList;

    private GetMyTenantsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tenantList = builder.tenantList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMyTenantsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return tenantList
     */
    public java.util.List<TenantList> getTenantList() {
        return this.tenantList;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private java.util.List<TenantList> tenantList; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TenantList.
         */
        public Builder tenantList(java.util.List<TenantList> tenantList) {
            this.tenantList = tenantList;
            return this;
        }

        public GetMyTenantsResponseBody build() {
            return new GetMyTenantsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMyTenantsResponseBody} extends {@link TeaModel}
     *
     * <p>GetMyTenantsResponseBody</p>
     */
    public static class TenantList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeleteTime")
        private Long deleteTime;

        @com.aliyun.core.annotation.NameInMap("Deleted")
        private Boolean deleted;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OpsTenant")
        private Boolean opsTenant;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("ResourceLimited")
        private Boolean resourceLimited;

        @com.aliyun.core.annotation.NameInMap("TenantTypeList")
        private java.util.List<String> tenantTypeList;

        @com.aliyun.core.annotation.NameInMap("TitleType")
        private String titleType;

        @com.aliyun.core.annotation.NameInMap("Visible")
        private Boolean visible;

        private TenantList(Builder builder) {
            this.deleteTime = builder.deleteTime;
            this.deleted = builder.deleted;
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
            this.opsTenant = builder.opsTenant;
            this.ownerId = builder.ownerId;
            this.resourceLimited = builder.resourceLimited;
            this.tenantTypeList = builder.tenantTypeList;
            this.titleType = builder.titleType;
            this.visible = builder.visible;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantList create() {
            return builder().build();
        }

        /**
         * @return deleteTime
         */
        public Long getDeleteTime() {
            return this.deleteTime;
        }

        /**
         * @return deleted
         */
        public Boolean getDeleted() {
            return this.deleted;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return opsTenant
         */
        public Boolean getOpsTenant() {
            return this.opsTenant;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return resourceLimited
         */
        public Boolean getResourceLimited() {
            return this.resourceLimited;
        }

        /**
         * @return tenantTypeList
         */
        public java.util.List<String> getTenantTypeList() {
            return this.tenantTypeList;
        }

        /**
         * @return titleType
         */
        public String getTitleType() {
            return this.titleType;
        }

        /**
         * @return visible
         */
        public Boolean getVisible() {
            return this.visible;
        }

        public static final class Builder {
            private Long deleteTime; 
            private Boolean deleted; 
            private String description; 
            private Long id; 
            private String name; 
            private Boolean opsTenant; 
            private String ownerId; 
            private Boolean resourceLimited; 
            private java.util.List<String> tenantTypeList; 
            private String titleType; 
            private Boolean visible; 

            /**
             * DeleteTime.
             */
            public Builder deleteTime(Long deleteTime) {
                this.deleteTime = deleteTime;
                return this;
            }

            /**
             * Deleted.
             */
            public Builder deleted(Boolean deleted) {
                this.deleted = deleted;
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
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OpsTenant.
             */
            public Builder opsTenant(Boolean opsTenant) {
                this.opsTenant = opsTenant;
                return this;
            }

            /**
             * OwnerId.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * ResourceLimited.
             */
            public Builder resourceLimited(Boolean resourceLimited) {
                this.resourceLimited = resourceLimited;
                return this;
            }

            /**
             * TenantTypeList.
             */
            public Builder tenantTypeList(java.util.List<String> tenantTypeList) {
                this.tenantTypeList = tenantTypeList;
                return this;
            }

            /**
             * TitleType.
             */
            public Builder titleType(String titleType) {
                this.titleType = titleType;
                return this;
            }

            /**
             * Visible.
             */
            public Builder visible(Boolean visible) {
                this.visible = visible;
                return this;
            }

            public TenantList build() {
                return new TenantList(this);
            } 

        } 

    }
}
