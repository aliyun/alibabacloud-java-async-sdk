// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link ListInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceResponseBody</p>
 */
public class ListInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List<Instances> instances;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListInstanceResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instances
     */
    public java.util.List<Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Instances> instances; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListInstanceResponseBody model) {
            this.instances = model.instances;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of chatbots.</p>
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>92B81548-42B9-4B34-924B-4E778AEB412B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInstanceResponseBody build() {
            return new ListInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Avatar")
        private String avatar;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Introduction")
        private String introduction;

        @com.aliyun.core.annotation.NameInMap("LanguageCode")
        private String languageCode;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RobotType")
        private String robotType;

        private Instances(Builder builder) {
            this.avatar = builder.avatar;
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.introduction = builder.introduction;
            this.languageCode = builder.languageCode;
            this.name = builder.name;
            this.robotType = builder.robotType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return avatar
         */
        public String getAvatar() {
            return this.avatar;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return introduction
         */
        public String getIntroduction() {
            return this.introduction;
        }

        /**
         * @return languageCode
         */
        public String getLanguageCode() {
            return this.languageCode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return robotType
         */
        public String getRobotType() {
            return this.robotType;
        }

        public static final class Builder {
            private String avatar; 
            private String createTime; 
            private String instanceId; 
            private String introduction; 
            private String languageCode; 
            private String name; 
            private String robotType; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.avatar = model.avatar;
                this.createTime = model.createTime;
                this.instanceId = model.instanceId;
                this.introduction = model.introduction;
                this.languageCode = model.languageCode;
                this.name = model.name;
                this.robotType = model.robotType;
            } 

            /**
             * <p>The URL of the chatbot avatar.</p>
             * 
             * <strong>example:</strong>
             * <p>/alimefe/meebot/robot/0.0.5/img/xxx-90-97.png</p>
             */
            public Builder avatar(String avatar) {
                this.avatar = avatar;
                return this;
            }

            /**
             * <p>The UTC time when the chatbot was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-08-12T16:00:01Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The unique identifier of the chatbot.</p>
             * 
             * <strong>example:</strong>
             * <p>chatbot-cn-mp90s2lrk00050</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The description of the chatbot.</p>
             * 
             * <strong>example:</strong>
             * <p>A chatbot for consumer Q&amp;A</p>
             */
            public Builder introduction(String introduction) {
                this.introduction = introduction;
                return this;
            }

            /**
             * <p>The language of the chatbot service, such as zh-cn or en-us. For more information, see <a href="http://www.lingoes.net/zh/translator/langcode.htm">http://www.lingoes.net/zh/translator/langcode.htm</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>zh-cn</p>
             */
            public Builder languageCode(String languageCode) {
                this.languageCode = languageCode;
                return this;
            }

            /**
             * <p>The name of the chatbot.</p>
             * 
             * <strong>example:</strong>
             * <p>Intelligent Customer Service - Bot C</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the chatbot.</p>
             * 
             * <strong>example:</strong>
             * <p>scenario_im</p>
             */
            public Builder robotType(String robotType) {
                this.robotType = robotType;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
