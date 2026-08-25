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
 * {@link GetAgentTaskResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentTaskResultResponseBody</p>
 */
public class GetAgentTaskResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private GetAgentTaskResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentTaskResultResponseBody create() {
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(GetAgentTaskResultResponseBody model) {
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
         * <p>F190ADE9-619A-447D-84E3-7E241A5C428E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetAgentTaskResultResponseBody build() {
            return new GetAgentTaskResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAgentTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentTaskResultResponseBody</p>
     */
    public static class Dialogues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Begin")
        private Long begin;

        @com.aliyun.core.annotation.NameInMap("EmotionValue")
        private Integer emotionValue;

        @com.aliyun.core.annotation.NameInMap("End")
        private Long end;

        @com.aliyun.core.annotation.NameInMap("HourMinSec")
        private String hourMinSec;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("SpeechRate")
        private Integer speechRate;

        @com.aliyun.core.annotation.NameInMap("Words")
        private String words;

        private Dialogues(Builder builder) {
            this.begin = builder.begin;
            this.emotionValue = builder.emotionValue;
            this.end = builder.end;
            this.hourMinSec = builder.hourMinSec;
            this.role = builder.role;
            this.speechRate = builder.speechRate;
            this.words = builder.words;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dialogues create() {
            return builder().build();
        }

        /**
         * @return begin
         */
        public Long getBegin() {
            return this.begin;
        }

        /**
         * @return emotionValue
         */
        public Integer getEmotionValue() {
            return this.emotionValue;
        }

        /**
         * @return end
         */
        public Long getEnd() {
            return this.end;
        }

        /**
         * @return hourMinSec
         */
        public String getHourMinSec() {
            return this.hourMinSec;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return speechRate
         */
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        /**
         * @return words
         */
        public String getWords() {
            return this.words;
        }

        public static final class Builder {
            private Long begin; 
            private Integer emotionValue; 
            private Long end; 
            private String hourMinSec; 
            private String role; 
            private Integer speechRate; 
            private String words; 

            private Builder() {
            } 

            private Builder(Dialogues model) {
                this.begin = model.begin;
                this.emotionValue = model.emotionValue;
                this.end = model.end;
                this.hourMinSec = model.hourMinSec;
                this.role = model.role;
                this.speechRate = model.speechRate;
                this.words = model.words;
            } 

            /**
             * Begin.
             */
            public Builder begin(Long begin) {
                this.begin = begin;
                return this;
            }

            /**
             * EmotionValue.
             */
            public Builder emotionValue(Integer emotionValue) {
                this.emotionValue = emotionValue;
                return this;
            }

            /**
             * End.
             */
            public Builder end(Long end) {
                this.end = end;
                return this;
            }

            /**
             * HourMinSec.
             */
            public Builder hourMinSec(String hourMinSec) {
                this.hourMinSec = hourMinSec;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * SpeechRate.
             */
            public Builder speechRate(Integer speechRate) {
                this.speechRate = speechRate;
                return this;
            }

            /**
             * Words.
             */
            public Builder words(String words) {
                this.words = words;
                return this;
            }

            public Dialogues build() {
                return new Dialogues(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAgentTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentTaskResultResponseBody</p>
     */
    public static class CustomerPromptResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private CustomerPromptResponse(Builder builder) {
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomerPromptResponse create() {
            return builder().build();
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private String text; 

            private Builder() {
            } 

            private Builder(CustomerPromptResponse model) {
                this.text = model.text;
            } 

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public CustomerPromptResponse build() {
                return new CustomerPromptResponse(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAgentTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentTaskResultResponseBody</p>
     */
    public static class FieldVoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OriginalUtterances")
        private java.util.List<Integer> originalUtterances;

        @com.aliyun.core.annotation.NameInMap("Remarks")
        private String remarks;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private FieldVoList(Builder builder) {
            this.name = builder.name;
            this.originalUtterances = builder.originalUtterances;
            this.remarks = builder.remarks;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FieldVoList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return originalUtterances
         */
        public java.util.List<Integer> getOriginalUtterances() {
            return this.originalUtterances;
        }

        /**
         * @return remarks
         */
        public String getRemarks() {
            return this.remarks;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private java.util.List<Integer> originalUtterances; 
            private String remarks; 
            private String value; 

            private Builder() {
            } 

            private Builder(FieldVoList model) {
                this.name = model.name;
                this.originalUtterances = model.originalUtterances;
                this.remarks = model.remarks;
                this.value = model.value;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OriginalUtterances.
             */
            public Builder originalUtterances(java.util.List<Integer> originalUtterances) {
                this.originalUtterances = originalUtterances;
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
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public FieldVoList build() {
                return new FieldVoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAgentTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentTaskResultResponseBody</p>
     */
    public static class FieldResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldVoList")
        private java.util.List<FieldVoList> fieldVoList;

        private FieldResponse(Builder builder) {
            this.fieldVoList = builder.fieldVoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FieldResponse create() {
            return builder().build();
        }

        /**
         * @return fieldVoList
         */
        public java.util.List<FieldVoList> getFieldVoList() {
            return this.fieldVoList;
        }

        public static final class Builder {
            private java.util.List<FieldVoList> fieldVoList; 

            private Builder() {
            } 

            private Builder(FieldResponse model) {
                this.fieldVoList = model.fieldVoList;
            } 

            /**
             * FieldVoList.
             */
            public Builder fieldVoList(java.util.List<FieldVoList> fieldVoList) {
                this.fieldVoList = fieldVoList;
                return this;
            }

            public FieldResponse build() {
                return new FieldResponse(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAgentTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentTaskResultResponseBody</p>
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
     * {@link GetAgentTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentTaskResultResponseBody</p>
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
     * {@link GetAgentTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentTaskResultResponseBody</p>
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
     * {@link GetAgentTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentTaskResultResponseBody</p>
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
     * {@link GetAgentTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentTaskResultResponseBody</p>
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
     * {@link GetAgentTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentTaskResultResponseBody</p>
     */
    public static class MultiLevelTagResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagList")
        private java.util.List<TagList> tagList;

        private MultiLevelTagResponse(Builder builder) {
            this.tagList = builder.tagList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultiLevelTagResponse create() {
            return builder().build();
        }

        /**
         * @return tagList
         */
        public java.util.List<TagList> getTagList() {
            return this.tagList;
        }

        public static final class Builder {
            private java.util.List<TagList> tagList; 

            private Builder() {
            } 

            private Builder(MultiLevelTagResponse model) {
                this.tagList = model.tagList;
            } 

            /**
             * TagList.
             */
            public Builder tagList(java.util.List<TagList> tagList) {
                this.tagList = tagList;
                return this;
            }

            public MultiLevelTagResponse build() {
                return new MultiLevelTagResponse(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAgentTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentTaskResultResponseBody</p>
     */
    public static class ServiceInspectionVoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dimension")
        private String dimension;

        @com.aliyun.core.annotation.NameInMap("IsMatch")
        private Boolean isMatch;

        @com.aliyun.core.annotation.NameInMap("OriginalUtterances")
        private java.util.List<String> originalUtterances;

        @com.aliyun.core.annotation.NameInMap("Remarks")
        private String remarks;

        private ServiceInspectionVoList(Builder builder) {
            this.dimension = builder.dimension;
            this.isMatch = builder.isMatch;
            this.originalUtterances = builder.originalUtterances;
            this.remarks = builder.remarks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceInspectionVoList create() {
            return builder().build();
        }

        /**
         * @return dimension
         */
        public String getDimension() {
            return this.dimension;
        }

        /**
         * @return isMatch
         */
        public Boolean getIsMatch() {
            return this.isMatch;
        }

        /**
         * @return originalUtterances
         */
        public java.util.List<String> getOriginalUtterances() {
            return this.originalUtterances;
        }

        /**
         * @return remarks
         */
        public String getRemarks() {
            return this.remarks;
        }

        public static final class Builder {
            private String dimension; 
            private Boolean isMatch; 
            private java.util.List<String> originalUtterances; 
            private String remarks; 

            private Builder() {
            } 

            private Builder(ServiceInspectionVoList model) {
                this.dimension = model.dimension;
                this.isMatch = model.isMatch;
                this.originalUtterances = model.originalUtterances;
                this.remarks = model.remarks;
            } 

            /**
             * Dimension.
             */
            public Builder dimension(String dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * IsMatch.
             */
            public Builder isMatch(Boolean isMatch) {
                this.isMatch = isMatch;
                return this;
            }

            /**
             * OriginalUtterances.
             */
            public Builder originalUtterances(java.util.List<String> originalUtterances) {
                this.originalUtterances = originalUtterances;
                return this;
            }

            /**
             * Remarks.
             */
            public Builder remarks(String remarks) {
                this.remarks = remarks;
                return this;
            }

            public ServiceInspectionVoList build() {
                return new ServiceInspectionVoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAgentTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentTaskResultResponseBody</p>
     */
    public static class ServiceInspectionResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServiceInspectionVoList")
        private java.util.List<ServiceInspectionVoList> serviceInspectionVoList;

        private ServiceInspectionResponse(Builder builder) {
            this.serviceInspectionVoList = builder.serviceInspectionVoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceInspectionResponse create() {
            return builder().build();
        }

        /**
         * @return serviceInspectionVoList
         */
        public java.util.List<ServiceInspectionVoList> getServiceInspectionVoList() {
            return this.serviceInspectionVoList;
        }

        public static final class Builder {
            private java.util.List<ServiceInspectionVoList> serviceInspectionVoList; 

            private Builder() {
            } 

            private Builder(ServiceInspectionResponse model) {
                this.serviceInspectionVoList = model.serviceInspectionVoList;
            } 

            /**
             * ServiceInspectionVoList.
             */
            public Builder serviceInspectionVoList(java.util.List<ServiceInspectionVoList> serviceInspectionVoList) {
                this.serviceInspectionVoList = serviceInspectionVoList;
                return this;
            }

            public ServiceInspectionResponse build() {
                return new ServiceInspectionResponse(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAgentTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentTaskResultResponseBody</p>
     */
    public static class TagCategoryVoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dimension")
        private String dimension;

        @com.aliyun.core.annotation.NameInMap("IsMatch")
        private Boolean isMatch;

        @com.aliyun.core.annotation.NameInMap("OriginalUtterances")
        private java.util.List<String> originalUtterances;

        @com.aliyun.core.annotation.NameInMap("Remarks")
        private String remarks;

        @com.aliyun.core.annotation.NameInMap("ResultLabels")
        private java.util.List<String> resultLabels;

        private TagCategoryVoList(Builder builder) {
            this.dimension = builder.dimension;
            this.isMatch = builder.isMatch;
            this.originalUtterances = builder.originalUtterances;
            this.remarks = builder.remarks;
            this.resultLabels = builder.resultLabels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagCategoryVoList create() {
            return builder().build();
        }

        /**
         * @return dimension
         */
        public String getDimension() {
            return this.dimension;
        }

        /**
         * @return isMatch
         */
        public Boolean getIsMatch() {
            return this.isMatch;
        }

        /**
         * @return originalUtterances
         */
        public java.util.List<String> getOriginalUtterances() {
            return this.originalUtterances;
        }

        /**
         * @return remarks
         */
        public String getRemarks() {
            return this.remarks;
        }

        /**
         * @return resultLabels
         */
        public java.util.List<String> getResultLabels() {
            return this.resultLabels;
        }

        public static final class Builder {
            private String dimension; 
            private Boolean isMatch; 
            private java.util.List<String> originalUtterances; 
            private String remarks; 
            private java.util.List<String> resultLabels; 

            private Builder() {
            } 

            private Builder(TagCategoryVoList model) {
                this.dimension = model.dimension;
                this.isMatch = model.isMatch;
                this.originalUtterances = model.originalUtterances;
                this.remarks = model.remarks;
                this.resultLabels = model.resultLabels;
            } 

            /**
             * Dimension.
             */
            public Builder dimension(String dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * IsMatch.
             */
            public Builder isMatch(Boolean isMatch) {
                this.isMatch = isMatch;
                return this;
            }

            /**
             * OriginalUtterances.
             */
            public Builder originalUtterances(java.util.List<String> originalUtterances) {
                this.originalUtterances = originalUtterances;
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
             * ResultLabels.
             */
            public Builder resultLabels(java.util.List<String> resultLabels) {
                this.resultLabels = resultLabels;
                return this;
            }

            public TagCategoryVoList build() {
                return new TagCategoryVoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAgentTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentTaskResultResponseBody</p>
     */
    public static class TagCategoryResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagCategoryVoList")
        private java.util.List<TagCategoryVoList> tagCategoryVoList;

        private TagCategoryResponse(Builder builder) {
            this.tagCategoryVoList = builder.tagCategoryVoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagCategoryResponse create() {
            return builder().build();
        }

        /**
         * @return tagCategoryVoList
         */
        public java.util.List<TagCategoryVoList> getTagCategoryVoList() {
            return this.tagCategoryVoList;
        }

        public static final class Builder {
            private java.util.List<TagCategoryVoList> tagCategoryVoList; 

            private Builder() {
            } 

            private Builder(TagCategoryResponse model) {
                this.tagCategoryVoList = model.tagCategoryVoList;
            } 

            /**
             * TagCategoryVoList.
             */
            public Builder tagCategoryVoList(java.util.List<TagCategoryVoList> tagCategoryVoList) {
                this.tagCategoryVoList = tagCategoryVoList;
                return this;
            }

            public TagCategoryResponse build() {
                return new TagCategoryResponse(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAgentTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentTaskResultResponseBody</p>
     */
    public static class Additions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Age")
        private String age;

        @com.aliyun.core.annotation.NameInMap("AgeGroup")
        private String ageGroup;

        @com.aliyun.core.annotation.NameInMap("AgeScore")
        private Float ageScore;

        @com.aliyun.core.annotation.NameInMap("BestVoiceprintScore")
        private Float bestVoiceprintScore;

        @com.aliyun.core.annotation.NameInMap("Emotion")
        private String emotion;

        @com.aliyun.core.annotation.NameInMap("EmotionScore")
        private Float emotionScore;

        @com.aliyun.core.annotation.NameInMap("Gender")
        private String gender;

        @com.aliyun.core.annotation.NameInMap("GenderScore")
        private Float genderScore;

        @com.aliyun.core.annotation.NameInMap("IsKnownVoiceprint")
        private Boolean isKnownVoiceprint;

        @com.aliyun.core.annotation.NameInMap("Speaker")
        private String speaker;

        private Additions(Builder builder) {
            this.age = builder.age;
            this.ageGroup = builder.ageGroup;
            this.ageScore = builder.ageScore;
            this.bestVoiceprintScore = builder.bestVoiceprintScore;
            this.emotion = builder.emotion;
            this.emotionScore = builder.emotionScore;
            this.gender = builder.gender;
            this.genderScore = builder.genderScore;
            this.isKnownVoiceprint = builder.isKnownVoiceprint;
            this.speaker = builder.speaker;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Additions create() {
            return builder().build();
        }

        /**
         * @return age
         */
        public String getAge() {
            return this.age;
        }

        /**
         * @return ageGroup
         */
        public String getAgeGroup() {
            return this.ageGroup;
        }

        /**
         * @return ageScore
         */
        public Float getAgeScore() {
            return this.ageScore;
        }

        /**
         * @return bestVoiceprintScore
         */
        public Float getBestVoiceprintScore() {
            return this.bestVoiceprintScore;
        }

        /**
         * @return emotion
         */
        public String getEmotion() {
            return this.emotion;
        }

        /**
         * @return emotionScore
         */
        public Float getEmotionScore() {
            return this.emotionScore;
        }

        /**
         * @return gender
         */
        public String getGender() {
            return this.gender;
        }

        /**
         * @return genderScore
         */
        public Float getGenderScore() {
            return this.genderScore;
        }

        /**
         * @return isKnownVoiceprint
         */
        public Boolean getIsKnownVoiceprint() {
            return this.isKnownVoiceprint;
        }

        /**
         * @return speaker
         */
        public String getSpeaker() {
            return this.speaker;
        }

        public static final class Builder {
            private String age; 
            private String ageGroup; 
            private Float ageScore; 
            private Float bestVoiceprintScore; 
            private String emotion; 
            private Float emotionScore; 
            private String gender; 
            private Float genderScore; 
            private Boolean isKnownVoiceprint; 
            private String speaker; 

            private Builder() {
            } 

            private Builder(Additions model) {
                this.age = model.age;
                this.ageGroup = model.ageGroup;
                this.ageScore = model.ageScore;
                this.bestVoiceprintScore = model.bestVoiceprintScore;
                this.emotion = model.emotion;
                this.emotionScore = model.emotionScore;
                this.gender = model.gender;
                this.genderScore = model.genderScore;
                this.isKnownVoiceprint = model.isKnownVoiceprint;
                this.speaker = model.speaker;
            } 

            /**
             * Age.
             */
            public Builder age(String age) {
                this.age = age;
                return this;
            }

            /**
             * AgeGroup.
             */
            public Builder ageGroup(String ageGroup) {
                this.ageGroup = ageGroup;
                return this;
            }

            /**
             * AgeScore.
             */
            public Builder ageScore(Float ageScore) {
                this.ageScore = ageScore;
                return this;
            }

            /**
             * BestVoiceprintScore.
             */
            public Builder bestVoiceprintScore(Float bestVoiceprintScore) {
                this.bestVoiceprintScore = bestVoiceprintScore;
                return this;
            }

            /**
             * Emotion.
             */
            public Builder emotion(String emotion) {
                this.emotion = emotion;
                return this;
            }

            /**
             * EmotionScore.
             */
            public Builder emotionScore(Float emotionScore) {
                this.emotionScore = emotionScore;
                return this;
            }

            /**
             * Gender.
             */
            public Builder gender(String gender) {
                this.gender = gender;
                return this;
            }

            /**
             * GenderScore.
             */
            public Builder genderScore(Float genderScore) {
                this.genderScore = genderScore;
                return this;
            }

            /**
             * IsKnownVoiceprint.
             */
            public Builder isKnownVoiceprint(Boolean isKnownVoiceprint) {
                this.isKnownVoiceprint = isKnownVoiceprint;
                return this;
            }

            /**
             * Speaker.
             */
            public Builder speaker(String speaker) {
                this.speaker = speaker;
                return this;
            }

            public Additions build() {
                return new Additions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAgentTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentTaskResultResponseBody</p>
     */
    public static class Dialogue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Additions")
        private Additions additions;

        @com.aliyun.core.annotation.NameInMap("Begin")
        private Long begin;

        @com.aliyun.core.annotation.NameInMap("End")
        private Long end;

        @com.aliyun.core.annotation.NameInMap("Words")
        private String words;

        private Dialogue(Builder builder) {
            this.additions = builder.additions;
            this.begin = builder.begin;
            this.end = builder.end;
            this.words = builder.words;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dialogue create() {
            return builder().build();
        }

        /**
         * @return additions
         */
        public Additions getAdditions() {
            return this.additions;
        }

        /**
         * @return begin
         */
        public Long getBegin() {
            return this.begin;
        }

        /**
         * @return end
         */
        public Long getEnd() {
            return this.end;
        }

        /**
         * @return words
         */
        public String getWords() {
            return this.words;
        }

        public static final class Builder {
            private Additions additions; 
            private Long begin; 
            private Long end; 
            private String words; 

            private Builder() {
            } 

            private Builder(Dialogue model) {
                this.additions = model.additions;
                this.begin = model.begin;
                this.end = model.end;
                this.words = model.words;
            } 

            /**
             * Additions.
             */
            public Builder additions(Additions additions) {
                this.additions = additions;
                return this;
            }

            /**
             * Begin.
             */
            public Builder begin(Long begin) {
                this.begin = begin;
                return this;
            }

            /**
             * End.
             */
            public Builder end(Long end) {
                this.end = end;
                return this;
            }

            /**
             * Words.
             */
            public Builder words(String words) {
                this.words = words;
                return this;
            }

            public Dialogue build() {
                return new Dialogue(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAgentTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentTaskResultResponseBody</p>
     */
    public static class Errors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private Errors(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Errors create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String message; 

            private Builder() {
            } 

            private Builder(Errors model) {
                this.code = model.code;
                this.message = model.message;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Errors build() {
                return new Errors(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAgentTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentTaskResultResponseBody</p>
     */
    public static class VoiceprintResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dialogue")
        private java.util.List<Dialogue> dialogue;

        @com.aliyun.core.annotation.NameInMap("Errors")
        private java.util.List<Errors> errors;

        private VoiceprintResponse(Builder builder) {
            this.dialogue = builder.dialogue;
            this.errors = builder.errors;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VoiceprintResponse create() {
            return builder().build();
        }

        /**
         * @return dialogue
         */
        public java.util.List<Dialogue> getDialogue() {
            return this.dialogue;
        }

        /**
         * @return errors
         */
        public java.util.List<Errors> getErrors() {
            return this.errors;
        }

        public static final class Builder {
            private java.util.List<Dialogue> dialogue; 
            private java.util.List<Errors> errors; 

            private Builder() {
            } 

            private Builder(VoiceprintResponse model) {
                this.dialogue = model.dialogue;
                this.errors = model.errors;
            } 

            /**
             * Dialogue.
             */
            public Builder dialogue(java.util.List<Dialogue> dialogue) {
                this.dialogue = dialogue;
                return this;
            }

            /**
             * Errors.
             */
            public Builder errors(java.util.List<Errors> errors) {
                this.errors = errors;
                return this;
            }

            public VoiceprintResponse build() {
                return new VoiceprintResponse(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAgentTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentTaskResultResponseBody</p>
     */
    public static class DataResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomerPromptResponse")
        private CustomerPromptResponse customerPromptResponse;

        @com.aliyun.core.annotation.NameInMap("FieldResponse")
        private FieldResponse fieldResponse;

        @com.aliyun.core.annotation.NameInMap("MultiLevelTagResponse")
        private MultiLevelTagResponse multiLevelTagResponse;

        @com.aliyun.core.annotation.NameInMap("ServiceInspectionResponse")
        private ServiceInspectionResponse serviceInspectionResponse;

        @com.aliyun.core.annotation.NameInMap("TagCategoryResponse")
        private TagCategoryResponse tagCategoryResponse;

        @com.aliyun.core.annotation.NameInMap("VoiceprintResponse")
        private VoiceprintResponse voiceprintResponse;

        private DataResponse(Builder builder) {
            this.customerPromptResponse = builder.customerPromptResponse;
            this.fieldResponse = builder.fieldResponse;
            this.multiLevelTagResponse = builder.multiLevelTagResponse;
            this.serviceInspectionResponse = builder.serviceInspectionResponse;
            this.tagCategoryResponse = builder.tagCategoryResponse;
            this.voiceprintResponse = builder.voiceprintResponse;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataResponse create() {
            return builder().build();
        }

        /**
         * @return customerPromptResponse
         */
        public CustomerPromptResponse getCustomerPromptResponse() {
            return this.customerPromptResponse;
        }

        /**
         * @return fieldResponse
         */
        public FieldResponse getFieldResponse() {
            return this.fieldResponse;
        }

        /**
         * @return multiLevelTagResponse
         */
        public MultiLevelTagResponse getMultiLevelTagResponse() {
            return this.multiLevelTagResponse;
        }

        /**
         * @return serviceInspectionResponse
         */
        public ServiceInspectionResponse getServiceInspectionResponse() {
            return this.serviceInspectionResponse;
        }

        /**
         * @return tagCategoryResponse
         */
        public TagCategoryResponse getTagCategoryResponse() {
            return this.tagCategoryResponse;
        }

        /**
         * @return voiceprintResponse
         */
        public VoiceprintResponse getVoiceprintResponse() {
            return this.voiceprintResponse;
        }

        public static final class Builder {
            private CustomerPromptResponse customerPromptResponse; 
            private FieldResponse fieldResponse; 
            private MultiLevelTagResponse multiLevelTagResponse; 
            private ServiceInspectionResponse serviceInspectionResponse; 
            private TagCategoryResponse tagCategoryResponse; 
            private VoiceprintResponse voiceprintResponse; 

            private Builder() {
            } 

            private Builder(DataResponse model) {
                this.customerPromptResponse = model.customerPromptResponse;
                this.fieldResponse = model.fieldResponse;
                this.multiLevelTagResponse = model.multiLevelTagResponse;
                this.serviceInspectionResponse = model.serviceInspectionResponse;
                this.tagCategoryResponse = model.tagCategoryResponse;
                this.voiceprintResponse = model.voiceprintResponse;
            } 

            /**
             * CustomerPromptResponse.
             */
            public Builder customerPromptResponse(CustomerPromptResponse customerPromptResponse) {
                this.customerPromptResponse = customerPromptResponse;
                return this;
            }

            /**
             * FieldResponse.
             */
            public Builder fieldResponse(FieldResponse fieldResponse) {
                this.fieldResponse = fieldResponse;
                return this;
            }

            /**
             * MultiLevelTagResponse.
             */
            public Builder multiLevelTagResponse(MultiLevelTagResponse multiLevelTagResponse) {
                this.multiLevelTagResponse = multiLevelTagResponse;
                return this;
            }

            /**
             * ServiceInspectionResponse.
             */
            public Builder serviceInspectionResponse(ServiceInspectionResponse serviceInspectionResponse) {
                this.serviceInspectionResponse = serviceInspectionResponse;
                return this;
            }

            /**
             * TagCategoryResponse.
             */
            public Builder tagCategoryResponse(TagCategoryResponse tagCategoryResponse) {
                this.tagCategoryResponse = tagCategoryResponse;
                return this;
            }

            /**
             * VoiceprintResponse.
             */
            public Builder voiceprintResponse(VoiceprintResponse voiceprintResponse) {
                this.voiceprintResponse = voiceprintResponse;
                return this;
            }

            public DataResponse build() {
                return new DataResponse(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAgentTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentTaskResultResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputTokens")
        private String inputTokens;

        @com.aliyun.core.annotation.NameInMap("OutputTokens")
        private String outputTokens;

        @com.aliyun.core.annotation.NameInMap("TotalTokens")
        private String totalTokens;

        @com.aliyun.core.annotation.NameInMap("TymxPlusCount")
        private String tymxPlusCount;

        @com.aliyun.core.annotation.NameInMap("TymxTurboCount")
        private String tymxTurboCount;

        private Usage(Builder builder) {
            this.inputTokens = builder.inputTokens;
            this.outputTokens = builder.outputTokens;
            this.totalTokens = builder.totalTokens;
            this.tymxPlusCount = builder.tymxPlusCount;
            this.tymxTurboCount = builder.tymxTurboCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usage create() {
            return builder().build();
        }

        /**
         * @return inputTokens
         */
        public String getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return outputTokens
         */
        public String getOutputTokens() {
            return this.outputTokens;
        }

        /**
         * @return totalTokens
         */
        public String getTotalTokens() {
            return this.totalTokens;
        }

        /**
         * @return tymxPlusCount
         */
        public String getTymxPlusCount() {
            return this.tymxPlusCount;
        }

        /**
         * @return tymxTurboCount
         */
        public String getTymxTurboCount() {
            return this.tymxTurboCount;
        }

        public static final class Builder {
            private String inputTokens; 
            private String outputTokens; 
            private String totalTokens; 
            private String tymxPlusCount; 
            private String tymxTurboCount; 

            private Builder() {
            } 

            private Builder(Usage model) {
                this.inputTokens = model.inputTokens;
                this.outputTokens = model.outputTokens;
                this.totalTokens = model.totalTokens;
                this.tymxPlusCount = model.tymxPlusCount;
                this.tymxTurboCount = model.tymxTurboCount;
            } 

            /**
             * InputTokens.
             */
            public Builder inputTokens(String inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * OutputTokens.
             */
            public Builder outputTokens(String outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * TotalTokens.
             */
            public Builder totalTokens(String totalTokens) {
                this.totalTokens = totalTokens;
                return this;
            }

            /**
             * TymxPlusCount.
             */
            public Builder tymxPlusCount(String tymxPlusCount) {
                this.tymxPlusCount = tymxPlusCount;
                return this;
            }

            /**
             * TymxTurboCount.
             */
            public Builder tymxTurboCount(String tymxTurboCount) {
                this.tymxTurboCount = tymxTurboCount;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAgentTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentTaskResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dialogues")
        private java.util.List<Dialogues> dialogues;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("LlmRequestId")
        private String llmRequestId;

        @com.aliyun.core.annotation.NameInMap("Response")
        private DataResponse response;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private Usage usage;

        @com.aliyun.core.annotation.NameInMap("Vid")
        private String vid;

        private Data(Builder builder) {
            this.dialogues = builder.dialogues;
            this.errorMessage = builder.errorMessage;
            this.llmRequestId = builder.llmRequestId;
            this.response = builder.response;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.usage = builder.usage;
            this.vid = builder.vid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dialogues
         */
        public java.util.List<Dialogues> getDialogues() {
            return this.dialogues;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return llmRequestId
         */
        public String getLlmRequestId() {
            return this.llmRequestId;
        }

        /**
         * @return response
         */
        public DataResponse getResponse() {
            return this.response;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return usage
         */
        public Usage getUsage() {
            return this.usage;
        }

        /**
         * @return vid
         */
        public String getVid() {
            return this.vid;
        }

        public static final class Builder {
            private java.util.List<Dialogues> dialogues; 
            private String errorMessage; 
            private String llmRequestId; 
            private DataResponse response; 
            private String status; 
            private String taskId; 
            private Usage usage; 
            private String vid; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dialogues = model.dialogues;
                this.errorMessage = model.errorMessage;
                this.llmRequestId = model.llmRequestId;
                this.response = model.response;
                this.status = model.status;
                this.taskId = model.taskId;
                this.usage = model.usage;
                this.vid = model.vid;
            } 

            /**
             * Dialogues.
             */
            public Builder dialogues(java.util.List<Dialogues> dialogues) {
                this.dialogues = dialogues;
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
             * LlmRequestId.
             */
            public Builder llmRequestId(String llmRequestId) {
                this.llmRequestId = llmRequestId;
                return this;
            }

            /**
             * Response.
             */
            public Builder response(DataResponse response) {
                this.response = response;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * Usage.
             */
            public Builder usage(Usage usage) {
                this.usage = usage;
                return this;
            }

            /**
             * Vid.
             */
            public Builder vid(String vid) {
                this.vid = vid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
