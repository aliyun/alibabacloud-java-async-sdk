// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchLogResponseBody} extends {@link TeaModel}
 *
 * <p>SearchLogResponseBody</p>
 */
public class SearchLogResponseBody extends TeaModel {
    @NameInMap("Completed")
    private Boolean completed;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SlsLogItemList")
    private SlsLogItemList slsLogItemList;

    private SearchLogResponseBody(Builder builder) {
        this.completed = builder.completed;
        this.requestId = builder.requestId;
        this.slsLogItemList = builder.slsLogItemList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return completed
     */
    public Boolean getCompleted() {
        return this.completed;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slsLogItemList
     */
    public SlsLogItemList getSlsLogItemList() {
        return this.slsLogItemList;
    }

    public static final class Builder {
        private Boolean completed; 
        private String requestId; 
        private SlsLogItemList slsLogItemList; 

        /**
         * Completed.
         */
        public Builder completed(Boolean completed) {
            this.completed = completed;
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
         * SlsLogItemList.
         */
        public Builder slsLogItemList(SlsLogItemList slsLogItemList) {
            this.slsLogItemList = slsLogItemList;
            return this;
        }

        public SearchLogResponseBody build() {
            return new SearchLogResponseBody(this);
        } 

    } 

    public static class SlsLogItem extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("PackId")
        private String packId;

        @NameInMap("PackMeta")
        private String packMeta;

        @NameInMap("Path")
        private String path;

        @NameInMap("SourceIp")
        private String sourceIp;

        @NameInMap("Timestamp")
        private Integer timestamp;

        private SlsLogItem(Builder builder) {
            this.content = builder.content;
            this.hostName = builder.hostName;
            this.packId = builder.packId;
            this.packMeta = builder.packMeta;
            this.path = builder.path;
            this.sourceIp = builder.sourceIp;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlsLogItem create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return packId
         */
        public String getPackId() {
            return this.packId;
        }

        /**
         * @return packMeta
         */
        public String getPackMeta() {
            return this.packMeta;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return sourceIp
         */
        public String getSourceIp() {
            return this.sourceIp;
        }

        /**
         * @return timestamp
         */
        public Integer getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String content; 
            private String hostName; 
            private String packId; 
            private String packMeta; 
            private String path; 
            private String sourceIp; 
            private Integer timestamp; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * PackId.
             */
            public Builder packId(String packId) {
                this.packId = packId;
                return this;
            }

            /**
             * PackMeta.
             */
            public Builder packMeta(String packMeta) {
                this.packMeta = packMeta;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * SourceIp.
             */
            public Builder sourceIp(String sourceIp) {
                this.sourceIp = sourceIp;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Integer timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public SlsLogItem build() {
                return new SlsLogItem(this);
            } 

        } 

    }
    public static class SlsLogItemList extends TeaModel {
        @NameInMap("SlsLogItem")
        private java.util.List < SlsLogItem> slsLogItem;

        private SlsLogItemList(Builder builder) {
            this.slsLogItem = builder.slsLogItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlsLogItemList create() {
            return builder().build();
        }

        /**
         * @return slsLogItem
         */
        public java.util.List < SlsLogItem> getSlsLogItem() {
            return this.slsLogItem;
        }

        public static final class Builder {
            private java.util.List < SlsLogItem> slsLogItem; 

            /**
             * SlsLogItem.
             */
            public Builder slsLogItem(java.util.List < SlsLogItem> slsLogItem) {
                this.slsLogItem = slsLogItem;
                return this;
            }

            public SlsLogItemList build() {
                return new SlsLogItemList(this);
            } 

        } 

    }
}
