// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rai20240701.models;

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
 * {@link CreateTopicRequest} extends {@link RequestModel}
 *
 * <p>CreateTopicRequest</p>
 */
public class CreateTopicRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BodyData")
    private BodyData bodyData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicDefinition")
    private String topicDefinition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicName")
    private String topicName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private Long workspaceId;

    private CreateTopicRequest(Builder builder) {
        super(builder);
        this.bodyData = builder.bodyData;
        this.regionId = builder.regionId;
        this.topicDefinition = builder.topicDefinition;
        this.topicName = builder.topicName;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTopicRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bodyData
     */
    public BodyData getBodyData() {
        return this.bodyData;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return topicDefinition
     */
    public String getTopicDefinition() {
        return this.topicDefinition;
    }

    /**
     * @return topicName
     */
    public String getTopicName() {
        return this.topicName;
    }

    /**
     * @return workspaceId
     */
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateTopicRequest, Builder> {
        private BodyData bodyData; 
        private String regionId; 
        private String topicDefinition; 
        private String topicName; 
        private Long workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTopicRequest request) {
            super(request);
            this.bodyData = request.bodyData;
            this.regionId = request.regionId;
            this.topicDefinition = request.topicDefinition;
            this.topicName = request.topicName;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * BodyData.
         */
        public Builder bodyData(BodyData bodyData) {
            String bodyDataShrink = shrink(bodyData, "BodyData", "json");
            this.putBodyParameter("BodyData", bodyDataShrink);
            this.bodyData = bodyData;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TopicDefinition.
         */
        public Builder topicDefinition(String topicDefinition) {
            this.putQueryParameter("TopicDefinition", topicDefinition);
            this.topicDefinition = topicDefinition;
            return this;
        }

        /**
         * TopicName.
         */
        public Builder topicName(String topicName) {
            this.putQueryParameter("TopicName", topicName);
            this.topicName = topicName;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(Long workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateTopicRequest build() {
            return new CreateTopicRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateTopicRequest} extends {@link TeaModel}
     *
     * <p>CreateTopicRequest</p>
     */
    public static class TopicExampleInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ExampleType")
        private Integer exampleType;

        private TopicExampleInfoList(Builder builder) {
            this.content = builder.content;
            this.exampleType = builder.exampleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopicExampleInfoList create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return exampleType
         */
        public Integer getExampleType() {
            return this.exampleType;
        }

        public static final class Builder {
            private String content; 
            private Integer exampleType; 

            private Builder() {
            } 

            private Builder(TopicExampleInfoList model) {
                this.content = model.content;
                this.exampleType = model.exampleType;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * ExampleType.
             */
            public Builder exampleType(Integer exampleType) {
                this.exampleType = exampleType;
                return this;
            }

            public TopicExampleInfoList build() {
                return new TopicExampleInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTopicRequest} extends {@link TeaModel}
     *
     * <p>CreateTopicRequest</p>
     */
    public static class BodyData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TopicExampleInfoList")
        private java.util.List<TopicExampleInfoList> topicExampleInfoList;

        private BodyData(Builder builder) {
            this.topicExampleInfoList = builder.topicExampleInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BodyData create() {
            return builder().build();
        }

        /**
         * @return topicExampleInfoList
         */
        public java.util.List<TopicExampleInfoList> getTopicExampleInfoList() {
            return this.topicExampleInfoList;
        }

        public static final class Builder {
            private java.util.List<TopicExampleInfoList> topicExampleInfoList; 

            private Builder() {
            } 

            private Builder(BodyData model) {
                this.topicExampleInfoList = model.topicExampleInfoList;
            } 

            /**
             * TopicExampleInfoList.
             */
            public Builder topicExampleInfoList(java.util.List<TopicExampleInfoList> topicExampleInfoList) {
                this.topicExampleInfoList = topicExampleInfoList;
                return this;
            }

            public BodyData build() {
                return new BodyData(this);
            } 

        } 

    }
}
