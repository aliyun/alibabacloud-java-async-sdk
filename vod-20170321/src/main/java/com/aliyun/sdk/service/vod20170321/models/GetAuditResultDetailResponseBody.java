// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetAuditResultDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetAuditResultDetailResponseBody</p>
 */
public class GetAuditResultDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AIAuditResultDetail")
    private AIAuditResultDetail AIAuditResultDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAuditResultDetailResponseBody(Builder builder) {
        this.AIAuditResultDetail = builder.AIAuditResultDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuditResultDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIAuditResultDetail
     */
    public AIAuditResultDetail getAIAuditResultDetail() {
        return this.AIAuditResultDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AIAuditResultDetail AIAuditResultDetail; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAuditResultDetailResponseBody model) {
            this.AIAuditResultDetail = model.AIAuditResultDetail;
            this.requestId = model.requestId;
        } 

        /**
         * AIAuditResultDetail.
         */
        public Builder AIAuditResultDetail(AIAuditResultDetail AIAuditResultDetail) {
            this.AIAuditResultDetail = AIAuditResultDetail;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAuditResultDetailResponseBody build() {
            return new GetAuditResultDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAuditResultDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetAuditResultDetailResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Index")
        private String index;

        @com.aliyun.core.annotation.NameInMap("Object")
        private String object;

        @com.aliyun.core.annotation.NameInMap("PornLabel")
        private String pornLabel;

        @com.aliyun.core.annotation.NameInMap("PornScore")
        private String pornScore;

        @com.aliyun.core.annotation.NameInMap("TerrorismLabel")
        private String terrorismLabel;

        @com.aliyun.core.annotation.NameInMap("TerrorismScore")
        private String terrorismScore;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        private List(Builder builder) {
            this.index = builder.index;
            this.object = builder.object;
            this.pornLabel = builder.pornLabel;
            this.pornScore = builder.pornScore;
            this.terrorismLabel = builder.terrorismLabel;
            this.terrorismScore = builder.terrorismScore;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return index
         */
        public String getIndex() {
            return this.index;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
        }

        /**
         * @return pornLabel
         */
        public String getPornLabel() {
            return this.pornLabel;
        }

        /**
         * @return pornScore
         */
        public String getPornScore() {
            return this.pornScore;
        }

        /**
         * @return terrorismLabel
         */
        public String getTerrorismLabel() {
            return this.terrorismLabel;
        }

        /**
         * @return terrorismScore
         */
        public String getTerrorismScore() {
            return this.terrorismScore;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String index; 
            private String object; 
            private String pornLabel; 
            private String pornScore; 
            private String terrorismLabel; 
            private String terrorismScore; 
            private String timestamp; 

            private Builder() {
            } 

            private Builder(List model) {
                this.index = model.index;
                this.object = model.object;
                this.pornLabel = model.pornLabel;
                this.pornScore = model.pornScore;
                this.terrorismLabel = model.terrorismLabel;
                this.terrorismScore = model.terrorismScore;
                this.timestamp = model.timestamp;
            } 

            /**
             * Index.
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * Object.
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * PornLabel.
             */
            public Builder pornLabel(String pornLabel) {
                this.pornLabel = pornLabel;
                return this;
            }

            /**
             * PornScore.
             */
            public Builder pornScore(String pornScore) {
                this.pornScore = pornScore;
                return this;
            }

            /**
             * TerrorismLabel.
             */
            public Builder terrorismLabel(String terrorismLabel) {
                this.terrorismLabel = terrorismLabel;
                return this;
            }

            /**
             * TerrorismScore.
             */
            public Builder terrorismScore(String terrorismScore) {
                this.terrorismScore = terrorismScore;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAuditResultDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetAuditResultDetailResponseBody</p>
     */
    public static class AIAuditResultDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private AIAuditResultDetail(Builder builder) {
            this.list = builder.list;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIAuditResultDetail create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(AIAuditResultDetail model) {
                this.list = model.list;
                this.total = model.total;
            } 

            /**
             * List.
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public AIAuditResultDetail build() {
                return new AIAuditResultDetail(this);
            } 

        } 

    }
}
