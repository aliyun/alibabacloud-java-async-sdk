// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOTAJobByFirmwareResponseBody} extends {@link TeaModel}
 *
 * <p>ListOTAJobByFirmwareResponseBody</p>
 */
public class ListOTAJobByFirmwareResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("PageCount")
    private Integer pageCount;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
    private Integer total;

    private ListOTAJobByFirmwareResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.pageCount = builder.pageCount;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOTAJobByFirmwareResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return pageCount
     */
    public Integer getPageCount() {
        return this.pageCount;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private Integer currentPage; 
        private Data data; 
        private String errorMessage; 
        private Integer pageCount; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * PageCount.
         */
        public Builder pageCount(Integer pageCount) {
            this.pageCount = pageCount;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListOTAJobByFirmwareResponseBody build() {
            return new ListOTAJobByFirmwareResponseBody(this);
        } 

    } 

    public static class OtaTagDTO extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private OtaTagDTO(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OtaTagDTO create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public OtaTagDTO build() {
                return new OtaTagDTO(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("OtaTagDTO")
        private java.util.List < OtaTagDTO> otaTagDTO;

        private Tags(Builder builder) {
            this.otaTagDTO = builder.otaTagDTO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return otaTagDTO
         */
        public java.util.List < OtaTagDTO> getOtaTagDTO() {
            return this.otaTagDTO;
        }

        public static final class Builder {
            private java.util.List < OtaTagDTO> otaTagDTO; 

            /**
             * OtaTagDTO.
             */
            public Builder otaTagDTO(java.util.List < OtaTagDTO> otaTagDTO) {
                this.otaTagDTO = otaTagDTO;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class SimpleOTAJobInfo extends TeaModel {
        @NameInMap("FirmwareId")
        private String firmwareId;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("JobStatus")
        private String jobStatus;

        @NameInMap("JobType")
        private String jobType;

        @NameInMap("ProductKey")
        private String productKey;

        @NameInMap("SelectionType")
        private String selectionType;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("TargetSelection")
        private String targetSelection;

        @NameInMap("UtcCreate")
        private String utcCreate;

        @NameInMap("UtcEndTime")
        private String utcEndTime;

        @NameInMap("UtcModified")
        private String utcModified;

        @NameInMap("UtcStartTime")
        private String utcStartTime;

        private SimpleOTAJobInfo(Builder builder) {
            this.firmwareId = builder.firmwareId;
            this.jobId = builder.jobId;
            this.jobStatus = builder.jobStatus;
            this.jobType = builder.jobType;
            this.productKey = builder.productKey;
            this.selectionType = builder.selectionType;
            this.tags = builder.tags;
            this.targetSelection = builder.targetSelection;
            this.utcCreate = builder.utcCreate;
            this.utcEndTime = builder.utcEndTime;
            this.utcModified = builder.utcModified;
            this.utcStartTime = builder.utcStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SimpleOTAJobInfo create() {
            return builder().build();
        }

        /**
         * @return firmwareId
         */
        public String getFirmwareId() {
            return this.firmwareId;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobStatus
         */
        public String getJobStatus() {
            return this.jobStatus;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return selectionType
         */
        public String getSelectionType() {
            return this.selectionType;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return targetSelection
         */
        public String getTargetSelection() {
            return this.targetSelection;
        }

        /**
         * @return utcCreate
         */
        public String getUtcCreate() {
            return this.utcCreate;
        }

        /**
         * @return utcEndTime
         */
        public String getUtcEndTime() {
            return this.utcEndTime;
        }

        /**
         * @return utcModified
         */
        public String getUtcModified() {
            return this.utcModified;
        }

        /**
         * @return utcStartTime
         */
        public String getUtcStartTime() {
            return this.utcStartTime;
        }

        public static final class Builder {
            private String firmwareId; 
            private String jobId; 
            private String jobStatus; 
            private String jobType; 
            private String productKey; 
            private String selectionType; 
            private Tags tags; 
            private String targetSelection; 
            private String utcCreate; 
            private String utcEndTime; 
            private String utcModified; 
            private String utcStartTime; 

            /**
             * FirmwareId.
             */
            public Builder firmwareId(String firmwareId) {
                this.firmwareId = firmwareId;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * JobStatus.
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * JobType.
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * SelectionType.
             */
            public Builder selectionType(String selectionType) {
                this.selectionType = selectionType;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * TargetSelection.
             */
            public Builder targetSelection(String targetSelection) {
                this.targetSelection = targetSelection;
                return this;
            }

            /**
             * UtcCreate.
             */
            public Builder utcCreate(String utcCreate) {
                this.utcCreate = utcCreate;
                return this;
            }

            /**
             * UtcEndTime.
             */
            public Builder utcEndTime(String utcEndTime) {
                this.utcEndTime = utcEndTime;
                return this;
            }

            /**
             * UtcModified.
             */
            public Builder utcModified(String utcModified) {
                this.utcModified = utcModified;
                return this;
            }

            /**
             * UtcStartTime.
             */
            public Builder utcStartTime(String utcStartTime) {
                this.utcStartTime = utcStartTime;
                return this;
            }

            public SimpleOTAJobInfo build() {
                return new SimpleOTAJobInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("SimpleOTAJobInfo")
        private java.util.List < SimpleOTAJobInfo> simpleOTAJobInfo;

        private Data(Builder builder) {
            this.simpleOTAJobInfo = builder.simpleOTAJobInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return simpleOTAJobInfo
         */
        public java.util.List < SimpleOTAJobInfo> getSimpleOTAJobInfo() {
            return this.simpleOTAJobInfo;
        }

        public static final class Builder {
            private java.util.List < SimpleOTAJobInfo> simpleOTAJobInfo; 

            /**
             * SimpleOTAJobInfo.
             */
            public Builder simpleOTAJobInfo(java.util.List < SimpleOTAJobInfo> simpleOTAJobInfo) {
                this.simpleOTAJobInfo = simpleOTAJobInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
