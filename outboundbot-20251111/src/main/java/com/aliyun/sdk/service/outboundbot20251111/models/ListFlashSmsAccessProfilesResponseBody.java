// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20251111.models;

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
 * {@link ListFlashSmsAccessProfilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListFlashSmsAccessProfilesResponseBody</p>
 */
public class ListFlashSmsAccessProfilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List<String> params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListFlashSmsAccessProfilesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.params = builder.params;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlashSmsAccessProfilesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
     * @return params
     */
    public java.util.List<String> getParams() {
        return this.params;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private java.util.List<String> params; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListFlashSmsAccessProfilesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>返回码</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>返回数据</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP状态码</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>错误信息</p>
         * 
         * <strong>example:</strong>
         * <p>Instance does not exist. Instance=outb001</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>错误信息中的变量值列表</p>
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * <p>请求ID</p>
         * 
         * <strong>example:</strong>
         * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>是否调用成功</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListFlashSmsAccessProfilesResponseBody build() {
            return new ListFlashSmsAccessProfilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFlashSmsAccessProfilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListFlashSmsAccessProfilesResponseBody</p>
     */
    public static class FlashSmsAccessProfiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessProfile")
        private String accessProfile;

        @com.aliyun.core.annotation.NameInMap("AccessProfileId")
        private String accessProfileId;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("ProviderId")
        private String providerId;

        @com.aliyun.core.annotation.NameInMap("ProviderName")
        private String providerName;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private Long updatedTime;

        private FlashSmsAccessProfiles(Builder builder) {
            this.accessProfile = builder.accessProfile;
            this.accessProfileId = builder.accessProfileId;
            this.createdTime = builder.createdTime;
            this.providerId = builder.providerId;
            this.providerName = builder.providerName;
            this.updatedTime = builder.updatedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlashSmsAccessProfiles create() {
            return builder().build();
        }

        /**
         * @return accessProfile
         */
        public String getAccessProfile() {
            return this.accessProfile;
        }

        /**
         * @return accessProfileId
         */
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return providerId
         */
        public String getProviderId() {
            return this.providerId;
        }

        /**
         * @return providerName
         */
        public String getProviderName() {
            return this.providerName;
        }

        /**
         * @return updatedTime
         */
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public static final class Builder {
            private String accessProfile; 
            private String accessProfileId; 
            private Long createdTime; 
            private String providerId; 
            private String providerName; 
            private Long updatedTime; 

            private Builder() {
            } 

            private Builder(FlashSmsAccessProfiles model) {
                this.accessProfile = model.accessProfile;
                this.accessProfileId = model.accessProfileId;
                this.createdTime = model.createdTime;
                this.providerId = model.providerId;
                this.providerName = model.providerName;
                this.updatedTime = model.updatedTime;
            } 

            /**
             * <p>接入配置</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;apiId&quot;:&quot;100235&quot;,&quot;apiKey&quot;:&quot;3aRsPrTsDG3OPNq5&quot;,&quot;aesKey&quot;:&quot;TQChVEAabhaNp2AB&quot;,&quot;capAppId&quot;:&quot;300012117547&quot;}</p>
             */
            public Builder accessProfile(String accessProfile) {
                this.accessProfile = accessProfile;
                return this;
            }

            /**
             * <p>接入配置ID</p>
             * 
             * <strong>example:</strong>
             * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
             */
            public Builder accessProfileId(String accessProfileId) {
                this.accessProfileId = accessProfileId;
                return this;
            }

            /**
             * <p>创建时间，毫秒级时间戳</p>
             * 
             * <strong>example:</strong>
             * <p>1735660800000</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>供应商ID</p>
             * 
             * <strong>example:</strong>
             * <p>Uincall</p>
             */
            public Builder providerId(String providerId) {
                this.providerId = providerId;
                return this;
            }

            /**
             * <p>供应商名称</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder providerName(String providerName) {
                this.providerName = providerName;
                return this;
            }

            /**
             * <p>更新时间，毫秒级时间戳</p>
             * 
             * <strong>example:</strong>
             * <p>1735660800000</p>
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            public FlashSmsAccessProfiles build() {
                return new FlashSmsAccessProfiles(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFlashSmsAccessProfilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListFlashSmsAccessProfilesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FlashSmsAccessProfiles")
        private java.util.List<FlashSmsAccessProfiles> flashSmsAccessProfiles;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.flashSmsAccessProfiles = builder.flashSmsAccessProfiles;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return flashSmsAccessProfiles
         */
        public java.util.List<FlashSmsAccessProfiles> getFlashSmsAccessProfiles() {
            return this.flashSmsAccessProfiles;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<FlashSmsAccessProfiles> flashSmsAccessProfiles; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.flashSmsAccessProfiles = model.flashSmsAccessProfiles;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>数据列表</p>
             */
            public Builder flashSmsAccessProfiles(java.util.List<FlashSmsAccessProfiles> flashSmsAccessProfiles) {
                this.flashSmsAccessProfiles = flashSmsAccessProfiles;
                return this;
            }

            /**
             * <p>页码，从1开始</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>每页记录数</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>符合条件的记录总数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
