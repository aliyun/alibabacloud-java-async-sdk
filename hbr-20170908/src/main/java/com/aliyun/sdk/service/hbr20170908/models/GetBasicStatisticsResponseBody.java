// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link GetBasicStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetBasicStatisticsResponseBody</p>
 */
public class GetBasicStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("GlobalStatistics")
    private GlobalStatistics globalStatistics;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RegionStatistics")
    private java.util.List<RegionStatistics> regionStatistics;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetBasicStatisticsResponseBody(Builder builder) {
        this.code = builder.code;
        this.globalStatistics = builder.globalStatistics;
        this.message = builder.message;
        this.regionStatistics = builder.regionStatistics;
        this.requestId = builder.requestId;
        this.sourceType = builder.sourceType;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBasicStatisticsResponseBody create() {
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
     * @return globalStatistics
     */
    public GlobalStatistics getGlobalStatistics() {
        return this.globalStatistics;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return regionStatistics
     */
    public java.util.List<RegionStatistics> getRegionStatistics() {
        return this.regionStatistics;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private GlobalStatistics globalStatistics; 
        private String message; 
        private java.util.List<RegionStatistics> regionStatistics; 
        private String requestId; 
        private String sourceType; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetBasicStatisticsResponseBody model) {
            this.code = model.code;
            this.globalStatistics = model.globalStatistics;
            this.message = model.message;
            this.regionStatistics = model.regionStatistics;
            this.requestId = model.requestId;
            this.sourceType = model.sourceType;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code. A value of 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The Backup statistics for all regions.</p>
         */
        public Builder globalStatistics(GlobalStatistics globalStatistics) {
            this.globalStatistics = globalStatistics;
            return this;
        }

        /**
         * <p>The response message. If the request is successful, <code>successful</code> is returned. If the request fails, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The Backup statistics for each region.</p>
         */
        public Builder regionStatistics(java.util.List<RegionStatistics> regionStatistics) {
            this.regionStatistics = regionStatistics;
            return this;
        }

        /**
         * <p>The Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EB526A5D-1FE2-51C1-B790-1732C1DBA969</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The data source type. The valid value is:</p>
         * <ul>
         * <li><strong>ECS_FILE</strong>: ECS File Backup.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS_FILE</p>
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * <ul>
         * <li><p>true: The request was successful.</p>
         * </li>
         * <li><p>false: The request failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetBasicStatisticsResponseBody build() {
            return new GetBasicStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBasicStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>GetBasicStatisticsResponseBody</p>
     */
    public static class GlobalStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProtectedDataSize")
        private Long protectedDataSize;

        @com.aliyun.core.annotation.NameInMap("ProtectedResourceCount")
        private Integer protectedResourceCount;

        private GlobalStatistics(Builder builder) {
            this.protectedDataSize = builder.protectedDataSize;
            this.protectedResourceCount = builder.protectedResourceCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GlobalStatistics create() {
            return builder().build();
        }

        /**
         * @return protectedDataSize
         */
        public Long getProtectedDataSize() {
            return this.protectedDataSize;
        }

        /**
         * @return protectedResourceCount
         */
        public Integer getProtectedResourceCount() {
            return this.protectedResourceCount;
        }

        public static final class Builder {
            private Long protectedDataSize; 
            private Integer protectedResourceCount; 

            private Builder() {
            } 

            private Builder(GlobalStatistics model) {
                this.protectedDataSize = model.protectedDataSize;
                this.protectedResourceCount = model.protectedResourceCount;
            } 

            /**
             * <p>The backed-up data size, in bytes.</p>
             * <ul>
             * <li>When <code>SourceType</code> is set to <code>ECS_FILE</code>, this parameter represents the total capacity of backed-up Cloud Disks.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>42949672960</p>
             */
            public Builder protectedDataSize(Long protectedDataSize) {
                this.protectedDataSize = protectedDataSize;
                return this;
            }

            /**
             * <p>The number of backed-up resources.</p>
             * <ul>
             * <li>When <code>SourceType</code> is set to <code>ECS_FILE</code>, this parameter represents the number of backed-up ECS instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder protectedResourceCount(Integer protectedResourceCount) {
                this.protectedResourceCount = protectedResourceCount;
                return this;
            }

            public GlobalStatistics build() {
                return new GlobalStatistics(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBasicStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>GetBasicStatisticsResponseBody</p>
     */
    public static class RegionStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProtectedDataSize")
        private Long protectedDataSize;

        @com.aliyun.core.annotation.NameInMap("ProtectedResourceCount")
        private Integer protectedResourceCount;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private RegionStatistics(Builder builder) {
            this.protectedDataSize = builder.protectedDataSize;
            this.protectedResourceCount = builder.protectedResourceCount;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionStatistics create() {
            return builder().build();
        }

        /**
         * @return protectedDataSize
         */
        public Long getProtectedDataSize() {
            return this.protectedDataSize;
        }

        /**
         * @return protectedResourceCount
         */
        public Integer getProtectedResourceCount() {
            return this.protectedResourceCount;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private Long protectedDataSize; 
            private Integer protectedResourceCount; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(RegionStatistics model) {
                this.protectedDataSize = model.protectedDataSize;
                this.protectedResourceCount = model.protectedResourceCount;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The backed-up data size, in bytes.</p>
             * <ul>
             * <li>When <code>SourceType</code> is set to <code>ECS_FILE</code>, this parameter represents the total capacity of backed-up Cloud Disks.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>42949672960</p>
             */
            public Builder protectedDataSize(Long protectedDataSize) {
                this.protectedDataSize = protectedDataSize;
                return this;
            }

            /**
             * <p>The number of backed-up resources.</p>
             * <ul>
             * <li>When <code>SourceType</code> is set to <code>ECS_FILE</code>, this parameter represents the number of backed-up ECS instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder protectedResourceCount(Integer protectedResourceCount) {
                this.protectedResourceCount = protectedResourceCount;
                return this;
            }

            /**
             * <p>The Region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public RegionStatistics build() {
                return new RegionStatistics(this);
            } 

        } 

    }
}
