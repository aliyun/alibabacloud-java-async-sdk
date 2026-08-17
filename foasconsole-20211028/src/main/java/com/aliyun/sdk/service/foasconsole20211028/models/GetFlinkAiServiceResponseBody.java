// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20211028.models;

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
 * {@link GetFlinkAiServiceResponseBody} extends {@link TeaModel}
 *
 * <p>GetFlinkAiServiceResponseBody</p>
 */
public class GetFlinkAiServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FlinkAiServiceDTO")
    private FlinkAiServiceDTO flinkAiServiceDTO;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetFlinkAiServiceResponseBody(Builder builder) {
        this.flinkAiServiceDTO = builder.flinkAiServiceDTO;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFlinkAiServiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flinkAiServiceDTO
     */
    public FlinkAiServiceDTO getFlinkAiServiceDTO() {
        return this.flinkAiServiceDTO;
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
        private FlinkAiServiceDTO flinkAiServiceDTO; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetFlinkAiServiceResponseBody model) {
            this.flinkAiServiceDTO = model.flinkAiServiceDTO;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * FlinkAiServiceDTO.
         */
        public Builder flinkAiServiceDTO(FlinkAiServiceDTO flinkAiServiceDTO) {
            this.flinkAiServiceDTO = flinkAiServiceDTO;
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

        public GetFlinkAiServiceResponseBody build() {
            return new GetFlinkAiServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFlinkAiServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetFlinkAiServiceResponseBody</p>
     */
    public static class FlinkAiServiceDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeletionProtection")
        private Boolean deletionProtection;

        @com.aliyun.core.annotation.NameInMap("FlinkAiInstanceStatus")
        private String flinkAiInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("MainInstanceId")
        private String mainInstanceId;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ResourceCreateTime")
        private Long resourceCreateTime;

        private FlinkAiServiceDTO(Builder builder) {
            this.deletionProtection = builder.deletionProtection;
            this.flinkAiInstanceStatus = builder.flinkAiInstanceStatus;
            this.mainInstanceId = builder.mainInstanceId;
            this.region = builder.region;
            this.resourceCreateTime = builder.resourceCreateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlinkAiServiceDTO create() {
            return builder().build();
        }

        /**
         * @return deletionProtection
         */
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        /**
         * @return flinkAiInstanceStatus
         */
        public String getFlinkAiInstanceStatus() {
            return this.flinkAiInstanceStatus;
        }

        /**
         * @return mainInstanceId
         */
        public String getMainInstanceId() {
            return this.mainInstanceId;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resourceCreateTime
         */
        public Long getResourceCreateTime() {
            return this.resourceCreateTime;
        }

        public static final class Builder {
            private Boolean deletionProtection; 
            private String flinkAiInstanceStatus; 
            private String mainInstanceId; 
            private String region; 
            private Long resourceCreateTime; 

            private Builder() {
            } 

            private Builder(FlinkAiServiceDTO model) {
                this.deletionProtection = model.deletionProtection;
                this.flinkAiInstanceStatus = model.flinkAiInstanceStatus;
                this.mainInstanceId = model.mainInstanceId;
                this.region = model.region;
                this.resourceCreateTime = model.resourceCreateTime;
            } 

            /**
             * DeletionProtection.
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * FlinkAiInstanceStatus.
             */
            public Builder flinkAiInstanceStatus(String flinkAiInstanceStatus) {
                this.flinkAiInstanceStatus = flinkAiInstanceStatus;
                return this;
            }

            /**
             * MainInstanceId.
             */
            public Builder mainInstanceId(String mainInstanceId) {
                this.mainInstanceId = mainInstanceId;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * ResourceCreateTime.
             */
            public Builder resourceCreateTime(Long resourceCreateTime) {
                this.resourceCreateTime = resourceCreateTime;
                return this;
            }

            public FlinkAiServiceDTO build() {
                return new FlinkAiServiceDTO(this);
            } 

        } 

    }
}
