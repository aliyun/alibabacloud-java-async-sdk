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
    public static class Response extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomerPromptResponse")
        private CustomerPromptResponse customerPromptResponse;

        @com.aliyun.core.annotation.NameInMap("FieldResponse")
        private FieldResponse fieldResponse;

        @com.aliyun.core.annotation.NameInMap("ServiceInspectionResponse")
        private ServiceInspectionResponse serviceInspectionResponse;

        @com.aliyun.core.annotation.NameInMap("TagCategoryResponse")
        private TagCategoryResponse tagCategoryResponse;

        private Response(Builder builder) {
            this.customerPromptResponse = builder.customerPromptResponse;
            this.fieldResponse = builder.fieldResponse;
            this.serviceInspectionResponse = builder.serviceInspectionResponse;
            this.tagCategoryResponse = builder.tagCategoryResponse;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Response create() {
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

        public static final class Builder {
            private CustomerPromptResponse customerPromptResponse; 
            private FieldResponse fieldResponse; 
            private ServiceInspectionResponse serviceInspectionResponse; 
            private TagCategoryResponse tagCategoryResponse; 

            private Builder() {
            } 

            private Builder(Response model) {
                this.customerPromptResponse = model.customerPromptResponse;
                this.fieldResponse = model.fieldResponse;
                this.serviceInspectionResponse = model.serviceInspectionResponse;
                this.tagCategoryResponse = model.tagCategoryResponse;
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

            public Response build() {
                return new Response(this);
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
        @com.aliyun.core.annotation.NameInMap("InputTokens")
        private String inputTokens;

        @com.aliyun.core.annotation.NameInMap("LlmRequestId")
        private String llmRequestId;

        @com.aliyun.core.annotation.NameInMap("OutputTokens")
        private String outputTokens;

        @com.aliyun.core.annotation.NameInMap("Response")
        private Response response;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TotalTokens")
        private String totalTokens;

        @com.aliyun.core.annotation.NameInMap("TyxmPlusCount")
        private String tyxmPlusCount;

        @com.aliyun.core.annotation.NameInMap("TyxmTurboCount")
        private String tyxmTurboCount;

        @com.aliyun.core.annotation.NameInMap("Vid")
        private String vid;

        private Data(Builder builder) {
            this.inputTokens = builder.inputTokens;
            this.llmRequestId = builder.llmRequestId;
            this.outputTokens = builder.outputTokens;
            this.response = builder.response;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.totalTokens = builder.totalTokens;
            this.tyxmPlusCount = builder.tyxmPlusCount;
            this.tyxmTurboCount = builder.tyxmTurboCount;
            this.vid = builder.vid;
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
        public String getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return llmRequestId
         */
        public String getLlmRequestId() {
            return this.llmRequestId;
        }

        /**
         * @return outputTokens
         */
        public String getOutputTokens() {
            return this.outputTokens;
        }

        /**
         * @return response
         */
        public Response getResponse() {
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
         * @return totalTokens
         */
        public String getTotalTokens() {
            return this.totalTokens;
        }

        /**
         * @return tyxmPlusCount
         */
        public String getTyxmPlusCount() {
            return this.tyxmPlusCount;
        }

        /**
         * @return tyxmTurboCount
         */
        public String getTyxmTurboCount() {
            return this.tyxmTurboCount;
        }

        /**
         * @return vid
         */
        public String getVid() {
            return this.vid;
        }

        public static final class Builder {
            private String inputTokens; 
            private String llmRequestId; 
            private String outputTokens; 
            private Response response; 
            private String status; 
            private String taskId; 
            private String totalTokens; 
            private String tyxmPlusCount; 
            private String tyxmTurboCount; 
            private String vid; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.inputTokens = model.inputTokens;
                this.llmRequestId = model.llmRequestId;
                this.outputTokens = model.outputTokens;
                this.response = model.response;
                this.status = model.status;
                this.taskId = model.taskId;
                this.totalTokens = model.totalTokens;
                this.tyxmPlusCount = model.tyxmPlusCount;
                this.tyxmTurboCount = model.tyxmTurboCount;
                this.vid = model.vid;
            } 

            /**
             * InputTokens.
             */
            public Builder inputTokens(String inputTokens) {
                this.inputTokens = inputTokens;
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
             * OutputTokens.
             */
            public Builder outputTokens(String outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * Response.
             */
            public Builder response(Response response) {
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
             * TotalTokens.
             */
            public Builder totalTokens(String totalTokens) {
                this.totalTokens = totalTokens;
                return this;
            }

            /**
             * TyxmPlusCount.
             */
            public Builder tyxmPlusCount(String tyxmPlusCount) {
                this.tyxmPlusCount = tyxmPlusCount;
                return this;
            }

            /**
             * TyxmTurboCount.
             */
            public Builder tyxmTurboCount(String tyxmTurboCount) {
                this.tyxmTurboCount = tyxmTurboCount;
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
