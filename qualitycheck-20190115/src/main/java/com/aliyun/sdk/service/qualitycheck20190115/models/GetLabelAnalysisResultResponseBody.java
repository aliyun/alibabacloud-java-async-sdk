// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link GetLabelAnalysisResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetLabelAnalysisResultResponseBody</p>
 */
public class GetLabelAnalysisResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetLabelAnalysisResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLabelAnalysisResultResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetLabelAnalysisResultResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>3CEA0495-341B-4482-9AD9-8191EF4***</p>
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

        public GetLabelAnalysisResultResponseBody build() {
            return new GetLabelAnalysisResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLabelAnalysisResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetLabelAnalysisResultResponseBody</p>
     */
    public static class Children extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Remarks")
        private String remarks;

        @com.aliyun.core.annotation.NameInMap("TagName")
        private String tagName;

        private Children(Builder builder) {
            this.remarks = builder.remarks;
            this.tagName = builder.tagName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Children create() {
            return builder().build();
        }

        /**
         * @return remarks
         */
        public String getRemarks() {
            return this.remarks;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        public static final class Builder {
            private String remarks; 
            private String tagName; 

            private Builder() {
            } 

            private Builder(Children model) {
                this.remarks = model.remarks;
                this.tagName = model.tagName;
            } 

            /**
             * Remarks.
             */
            public Builder remarks(String remarks) {
                this.remarks = remarks;
                return this;
            }

            /**
             * TagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            public Children build() {
                return new Children(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLabelAnalysisResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetLabelAnalysisResultResponseBody</p>
     */
    public static class ChildrenChildren extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Children")
        private java.util.List<Children> children;

        @com.aliyun.core.annotation.NameInMap("Remarks")
        private String remarks;

        @com.aliyun.core.annotation.NameInMap("TagName")
        private String tagName;

        private ChildrenChildren(Builder builder) {
            this.children = builder.children;
            this.remarks = builder.remarks;
            this.tagName = builder.tagName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChildrenChildren create() {
            return builder().build();
        }

        /**
         * @return children
         */
        public java.util.List<Children> getChildren() {
            return this.children;
        }

        /**
         * @return remarks
         */
        public String getRemarks() {
            return this.remarks;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        public static final class Builder {
            private java.util.List<Children> children; 
            private String remarks; 
            private String tagName; 

            private Builder() {
            } 

            private Builder(ChildrenChildren model) {
                this.children = model.children;
                this.remarks = model.remarks;
                this.tagName = model.tagName;
            } 

            /**
             * Children.
             */
            public Builder children(java.util.List<Children> children) {
                this.children = children;
                return this;
            }

            /**
             * Remarks.
             */
            public Builder remarks(String remarks) {
                this.remarks = remarks;
                return this;
            }

            /**
             * TagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            public ChildrenChildren build() {
                return new ChildrenChildren(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLabelAnalysisResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetLabelAnalysisResultResponseBody</p>
     */
    public static class TagListChildrenChildren extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Children")
        private java.util.List<ChildrenChildren> children;

        @com.aliyun.core.annotation.NameInMap("Remarks")
        private String remarks;

        @com.aliyun.core.annotation.NameInMap("TagName")
        private String tagName;

        private TagListChildrenChildren(Builder builder) {
            this.children = builder.children;
            this.remarks = builder.remarks;
            this.tagName = builder.tagName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagListChildrenChildren create() {
            return builder().build();
        }

        /**
         * @return children
         */
        public java.util.List<ChildrenChildren> getChildren() {
            return this.children;
        }

        /**
         * @return remarks
         */
        public String getRemarks() {
            return this.remarks;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        public static final class Builder {
            private java.util.List<ChildrenChildren> children; 
            private String remarks; 
            private String tagName; 

            private Builder() {
            } 

            private Builder(TagListChildrenChildren model) {
                this.children = model.children;
                this.remarks = model.remarks;
                this.tagName = model.tagName;
            } 

            /**
             * Children.
             */
            public Builder children(java.util.List<ChildrenChildren> children) {
                this.children = children;
                return this;
            }

            /**
             * Remarks.
             */
            public Builder remarks(String remarks) {
                this.remarks = remarks;
                return this;
            }

            /**
             * TagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            public TagListChildrenChildren build() {
                return new TagListChildrenChildren(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLabelAnalysisResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetLabelAnalysisResultResponseBody</p>
     */
    public static class TagListChildren extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Children")
        private java.util.List<TagListChildrenChildren> children;

        @com.aliyun.core.annotation.NameInMap("Remarks")
        private String remarks;

        @com.aliyun.core.annotation.NameInMap("TagName")
        private String tagName;

        private TagListChildren(Builder builder) {
            this.children = builder.children;
            this.remarks = builder.remarks;
            this.tagName = builder.tagName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagListChildren create() {
            return builder().build();
        }

        /**
         * @return children
         */
        public java.util.List<TagListChildrenChildren> getChildren() {
            return this.children;
        }

        /**
         * @return remarks
         */
        public String getRemarks() {
            return this.remarks;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        public static final class Builder {
            private java.util.List<TagListChildrenChildren> children; 
            private String remarks; 
            private String tagName; 

            private Builder() {
            } 

            private Builder(TagListChildren model) {
                this.children = model.children;
                this.remarks = model.remarks;
                this.tagName = model.tagName;
            } 

            /**
             * Children.
             */
            public Builder children(java.util.List<TagListChildrenChildren> children) {
                this.children = children;
                return this;
            }

            /**
             * Remarks.
             */
            public Builder remarks(String remarks) {
                this.remarks = remarks;
                return this;
            }

            /**
             * TagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            public TagListChildren build() {
                return new TagListChildren(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLabelAnalysisResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetLabelAnalysisResultResponseBody</p>
     */
    public static class TagList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Children")
        private java.util.List<TagListChildren> children;

        @com.aliyun.core.annotation.NameInMap("Remarks")
        private String remarks;

        @com.aliyun.core.annotation.NameInMap("TagName")
        private String tagName;

        private TagList(Builder builder) {
            this.children = builder.children;
            this.remarks = builder.remarks;
            this.tagName = builder.tagName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagList create() {
            return builder().build();
        }

        /**
         * @return children
         */
        public java.util.List<TagListChildren> getChildren() {
            return this.children;
        }

        /**
         * @return remarks
         */
        public String getRemarks() {
            return this.remarks;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        public static final class Builder {
            private java.util.List<TagListChildren> children; 
            private String remarks; 
            private String tagName; 

            private Builder() {
            } 

            private Builder(TagList model) {
                this.children = model.children;
                this.remarks = model.remarks;
                this.tagName = model.tagName;
            } 

            /**
             * Children.
             */
            public Builder children(java.util.List<TagListChildren> children) {
                this.children = children;
                return this;
            }

            /**
             * Remarks.
             */
            public Builder remarks(String remarks) {
                this.remarks = remarks;
                return this;
            }

            /**
             * TagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            public TagList build() {
                return new TagList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLabelAnalysisResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetLabelAnalysisResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputTokens")
        private Long inputTokens;

        @com.aliyun.core.annotation.NameInMap("OutputTokens")
        private Long outputTokens;

        @com.aliyun.core.annotation.NameInMap("TagList")
        private java.util.List<TagList> tagList;

        @com.aliyun.core.annotation.NameInMap("TotalTokens")
        private Long totalTokens;

        @com.aliyun.core.annotation.NameInMap("TyxmPlusCount")
        private Long tyxmPlusCount;

        @com.aliyun.core.annotation.NameInMap("TyxmTurboCount")
        private Long tyxmTurboCount;

        private Data(Builder builder) {
            this.inputTokens = builder.inputTokens;
            this.outputTokens = builder.outputTokens;
            this.tagList = builder.tagList;
            this.totalTokens = builder.totalTokens;
            this.tyxmPlusCount = builder.tyxmPlusCount;
            this.tyxmTurboCount = builder.tyxmTurboCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return inputTokens
         */
        public Long getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return outputTokens
         */
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        /**
         * @return tagList
         */
        public java.util.List<TagList> getTagList() {
            return this.tagList;
        }

        /**
         * @return totalTokens
         */
        public Long getTotalTokens() {
            return this.totalTokens;
        }

        /**
         * @return tyxmPlusCount
         */
        public Long getTyxmPlusCount() {
            return this.tyxmPlusCount;
        }

        /**
         * @return tyxmTurboCount
         */
        public Long getTyxmTurboCount() {
            return this.tyxmTurboCount;
        }

        public static final class Builder {
            private Long inputTokens; 
            private Long outputTokens; 
            private java.util.List<TagList> tagList; 
            private Long totalTokens; 
            private Long tyxmPlusCount; 
            private Long tyxmTurboCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.inputTokens = model.inputTokens;
                this.outputTokens = model.outputTokens;
                this.tagList = model.tagList;
                this.totalTokens = model.totalTokens;
                this.tyxmPlusCount = model.tyxmPlusCount;
                this.tyxmTurboCount = model.tyxmTurboCount;
            } 

            /**
             * InputTokens.
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * OutputTokens.
             */
            public Builder outputTokens(Long outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * TagList.
             */
            public Builder tagList(java.util.List<TagList> tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * TotalTokens.
             */
            public Builder totalTokens(Long totalTokens) {
                this.totalTokens = totalTokens;
                return this;
            }

            /**
             * TyxmPlusCount.
             */
            public Builder tyxmPlusCount(Long tyxmPlusCount) {
                this.tyxmPlusCount = tyxmPlusCount;
                return this;
            }

            /**
             * TyxmTurboCount.
             */
            public Builder tyxmTurboCount(Long tyxmTurboCount) {
                this.tyxmTurboCount = tyxmTurboCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
