// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.grace20220606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FileInfo} extends {@link TeaModel}
 *
 * <p>FileInfo</p>
 */
public class FileInfo extends TeaModel {
    @NameInMap("analyzeProgress")
    private AnalyzeProgress analyzeProgress;

    @NameInMap("creationTime")
    private Long creationTime;

    @NameInMap("displayName")
    private String displayName;

    @NameInMap("labels")
    private String labels;

    @NameInMap("name")
    private String name;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("shared")
    private Boolean shared;

    @NameInMap("size")
    private Long size;

    @NameInMap("transferProgress")
    private TransferProgress transferProgress;

    @NameInMap("transferState")
    private String transferState;

    @NameInMap("type")
    private String type;

    private FileInfo(Builder builder) {
        this.analyzeProgress = builder.analyzeProgress;
        this.creationTime = builder.creationTime;
        this.displayName = builder.displayName;
        this.labels = builder.labels;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.shared = builder.shared;
        this.size = builder.size;
        this.transferProgress = builder.transferProgress;
        this.transferState = builder.transferState;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FileInfo create() {
        return builder().build();
    }

    /**
     * @return analyzeProgress
     */
    public AnalyzeProgress getAnalyzeProgress() {
        return this.analyzeProgress;
    }

    /**
     * @return creationTime
     */
    public Long getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return labels
     */
    public String getLabels() {
        return this.labels;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return shared
     */
    public Boolean getShared() {
        return this.shared;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * @return transferProgress
     */
    public TransferProgress getTransferProgress() {
        return this.transferProgress;
    }

    /**
     * @return transferState
     */
    public String getTransferState() {
        return this.transferState;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private AnalyzeProgress analyzeProgress; 
        private Long creationTime; 
        private String displayName; 
        private String labels; 
        private String name; 
        private String requestId; 
        private Boolean shared; 
        private Long size; 
        private TransferProgress transferProgress; 
        private String transferState; 
        private String type; 

        /**
         * analyzeProgress.
         */
        public Builder analyzeProgress(AnalyzeProgress analyzeProgress) {
            this.analyzeProgress = analyzeProgress;
            return this;
        }

        /**
         * creationTime.
         */
        public Builder creationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * displayName.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * labels.
         */
        public Builder labels(String labels) {
            this.labels = labels;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * shared.
         */
        public Builder shared(Boolean shared) {
            this.shared = shared;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        /**
         * transferProgress.
         */
        public Builder transferProgress(TransferProgress transferProgress) {
            this.transferProgress = transferProgress;
            return this;
        }

        /**
         * transferState.
         */
        public Builder transferState(String transferState) {
            this.transferState = transferState;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public FileInfo build() {
            return new FileInfo(this);
        } 

    } 

    public static class AnalyzeProgress extends TeaModel {
        @NameInMap("message")
        private String message;

        @NameInMap("percent")
        private Double percent;

        @NameInMap("state")
        private String state;

        private AnalyzeProgress(Builder builder) {
            this.message = builder.message;
            this.percent = builder.percent;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnalyzeProgress create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return percent
         */
        public Double getPercent() {
            return this.percent;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String message; 
            private Double percent; 
            private String state; 

            /**
             * message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * percent.
             */
            public Builder percent(Double percent) {
                this.percent = percent;
                return this;
            }

            /**
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public AnalyzeProgress build() {
                return new AnalyzeProgress(this);
            } 

        } 

    }
    public static class TransferProgress extends TeaModel {
        @NameInMap("totalSize")
        private Long totalSize;

        @NameInMap("transferredSize")
        private Long transferredSize;

        private TransferProgress(Builder builder) {
            this.totalSize = builder.totalSize;
            this.transferredSize = builder.transferredSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferProgress create() {
            return builder().build();
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        /**
         * @return transferredSize
         */
        public Long getTransferredSize() {
            return this.transferredSize;
        }

        public static final class Builder {
            private Long totalSize; 
            private Long transferredSize; 

            /**
             * totalSize.
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            /**
             * transferredSize.
             */
            public Builder transferredSize(Long transferredSize) {
                this.transferredSize = transferredSize;
                return this;
            }

            public TransferProgress build() {
                return new TransferProgress(this);
            } 

        } 

    }
}
