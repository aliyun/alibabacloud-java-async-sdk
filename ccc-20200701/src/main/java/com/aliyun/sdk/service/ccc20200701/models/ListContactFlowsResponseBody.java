// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ListContactFlowsResponseBody} extends {@link TeaModel}
 *
 * <p>ListContactFlowsResponseBody</p>
 */
public class ListContactFlowsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListContactFlowsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListContactFlowsResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListContactFlowsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EEEE671A-3E24-4A04-81E6-6C4F5B39DF75</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListContactFlowsResponseBody build() {
            return new ListContactFlowsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListContactFlowsResponseBody} extends {@link TeaModel}
     *
     * <p>ListContactFlowsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactFlowId")
        private String contactFlowId;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("Definition")
        private String definition;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DraftId")
        private String draftId;

        @com.aliyun.core.annotation.NameInMap("Editor")
        private String editor;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NumberList")
        private java.util.List<String> numberList;

        @com.aliyun.core.annotation.NameInMap("Published")
        private Boolean published;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private String updatedTime;

        private List(Builder builder) {
            this.contactFlowId = builder.contactFlowId;
            this.createdTime = builder.createdTime;
            this.definition = builder.definition;
            this.description = builder.description;
            this.draftId = builder.draftId;
            this.editor = builder.editor;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.numberList = builder.numberList;
            this.published = builder.published;
            this.type = builder.type;
            this.updatedTime = builder.updatedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return contactFlowId
         */
        public String getContactFlowId() {
            return this.contactFlowId;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return definition
         */
        public String getDefinition() {
            return this.definition;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return draftId
         */
        public String getDraftId() {
            return this.draftId;
        }

        /**
         * @return editor
         */
        public String getEditor() {
            return this.editor;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return numberList
         */
        public java.util.List<String> getNumberList() {
            return this.numberList;
        }

        /**
         * @return published
         */
        public Boolean getPublished() {
            return this.published;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updatedTime
         */
        public String getUpdatedTime() {
            return this.updatedTime;
        }

        public static final class Builder {
            private String contactFlowId; 
            private String createdTime; 
            private String definition; 
            private String description; 
            private String draftId; 
            private String editor; 
            private String instanceId; 
            private String name; 
            private java.util.List<String> numberList; 
            private Boolean published; 
            private String type; 
            private String updatedTime; 

            private Builder() {
            } 

            private Builder(List model) {
                this.contactFlowId = model.contactFlowId;
                this.createdTime = model.createdTime;
                this.definition = model.definition;
                this.description = model.description;
                this.draftId = model.draftId;
                this.editor = model.editor;
                this.instanceId = model.instanceId;
                this.name = model.name;
                this.numberList = model.numberList;
                this.published = model.published;
                this.type = model.type;
                this.updatedTime = model.updatedTime;
            } 

            /**
             * <p>The ID of the IVR contact flow.</p>
             * 
             * <strong>example:</strong>
             * <p>78128960-bb00-4ddc-8e82-923a8c5bd22d</p>
             */
            public Builder contactFlowId(String contactFlowId) {
                this.contactFlowId = contactFlowId;
                return this;
            }

            /**
             * <p>When the contact flow was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-05 17:35:45.0</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The JSON-formatted definition of the IVR contact flow. This parameter is for internal use and is parsed by the backend.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;activities&quot;:[{&quot;type&quot;:&quot;INCOMING_CALL&quot;,&quot;id&quot;:&quot;e98f0d47&quot;,&quot;name&quot;:&quot;开始&quot;,&quot;properties&quot;:{&quot;position&quot;:{&quot;x&quot;:263,&quot;y&quot;:164}},&quot;events&quot;:[{&quot;event&quot;:&quot;complete&quot;,&quot;next&quot;:&quot;2d3ad2c2&quot;,&quot;edgeId&quot;:&quot;41f7dbd0&quot;}],&quot;nodeIndex&quot;:0},{&quot;type&quot;:&quot;HANGUP&quot;,&quot;id&quot;:&quot;bd4f37e2&quot;,&quot;name&quot;:&quot;挂机&quot;,&quot;properties&quot;:{&quot;position&quot;:{&quot;x&quot;:765,&quot;y&quot;:185}},&quot;events&quot;:[{&quot;event&quot;:&quot;complete&quot;,&quot;next&quot;:null}],&quot;nodeIndex&quot;:999},{&quot;type&quot;:&quot;PLAY_SAY&quot;,&quot;id&quot;:&quot;2d3ad2c2&quot;,&quot;name&quot;:&quot;放音&quot;,&quot;properties&quot;:{&quot;say&quot;:&quot;您好，欢迎来到云联络中心。&quot;,&quot;audioResourceId&quot;:&quot;&quot;,&quot;position&quot;:{&quot;x&quot;:485.5,&quot;y&quot;:153.5},&quot;audioType&quot;:&quot;tts&quot;,&quot;audioInterrupt&quot;:false},&quot;events&quot;:[{&quot;event&quot;:&quot;complete&quot;,&quot;next&quot;:&quot;bd4f37e2&quot;,&quot;edgeId&quot;:&quot;e1af4f1f&quot;}],&quot;nodeIndex&quot;:1}],&quot;description&quot;:&quot;&quot;}</p>
             */
            public Builder definition(String definition) {
                this.definition = definition;
                return this;
            }

            /**
             * <p>The description of the contact flow version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The draft ID. This parameter is returned only when the contact flow is unpublished.</p>
             * 
             * <strong>example:</strong>
             * <p>db07c0bb-6b1f-47d2-b37e-2451c617562d</p>
             */
            public Builder draftId(String draftId) {
                this.draftId = draftId;
                return this;
            }

            /**
             * <p>The login name of the agent currently editing this draft.</p>
             * 
             * <strong>example:</strong>
             * <p>ccc-test</p>
             */
            public Builder editor(String editor) {
                this.editor = editor;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ccc-test</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the IVR contact flow.</p>
             * 
             * <strong>example:</strong>
             * <p>默认流程</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>A list of phone numbers that are bound to the IVR contact flow.</p>
             */
            public Builder numberList(java.util.List<String> numberList) {
                this.numberList = numberList;
                return this;
            }

            /**
             * <p>Indicates whether the contact flow has been published.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder published(Boolean published) {
                this.published = published;
                return this;
            }

            /**
             * <p>The type of the IVR contact flow.</p>
             * 
             * <strong>example:</strong>
             * <p>MAIN_FLOW</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The last time the contact flow was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-08 15:34:49.0</p>
             */
            public Builder updatedTime(String updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListContactFlowsResponseBody} extends {@link TeaModel}
     *
     * <p>ListContactFlowsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.list = builder.list;
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
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
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
            private java.util.List<List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>A list of contact flows.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
