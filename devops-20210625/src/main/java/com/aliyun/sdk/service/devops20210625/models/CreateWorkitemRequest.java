// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWorkitemRequest} extends {@link RequestModel}
 *
 * <p>CreateWorkitemRequest</p>
 */
public class CreateWorkitemRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Body
    @NameInMap("assignedTo")
    @Validation(required = true)
    private String assignedTo;

    @Body
    @NameInMap("category")
    @Validation(required = true)
    private String category;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("descriptionFormat")
    private String descriptionFormat;

    @Body
    @NameInMap("fieldValueList")
    private java.util.List < FieldValueList> fieldValueList;

    @Body
    @NameInMap("parent")
    private String parent;

    @Body
    @NameInMap("participant")
    private java.util.List < String > participant;

    @Body
    @NameInMap("space")
    @Validation(required = true)
    private String space;

    @Body
    @NameInMap("spaceIdentifier")
    @Validation(required = true)
    private String spaceIdentifier;

    @Body
    @NameInMap("spaceType")
    @Validation(required = true)
    private String spaceType;

    @Body
    @NameInMap("sprint")
    private java.util.List < String > sprint;

    @Body
    @NameInMap("subject")
    @Validation(required = true)
    private String subject;

    @Body
    @NameInMap("tracker")
    private java.util.List < String > tracker;

    @Body
    @NameInMap("verifier")
    private java.util.List < String > verifier;

    @Body
    @NameInMap("workitemType")
    @Validation(required = true)
    private String workitemType;

    private CreateWorkitemRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.assignedTo = builder.assignedTo;
        this.category = builder.category;
        this.description = builder.description;
        this.descriptionFormat = builder.descriptionFormat;
        this.fieldValueList = builder.fieldValueList;
        this.parent = builder.parent;
        this.participant = builder.participant;
        this.space = builder.space;
        this.spaceIdentifier = builder.spaceIdentifier;
        this.spaceType = builder.spaceType;
        this.sprint = builder.sprint;
        this.subject = builder.subject;
        this.tracker = builder.tracker;
        this.verifier = builder.verifier;
        this.workitemType = builder.workitemType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkitemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return assignedTo
     */
    public String getAssignedTo() {
        return this.assignedTo;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return descriptionFormat
     */
    public String getDescriptionFormat() {
        return this.descriptionFormat;
    }

    /**
     * @return fieldValueList
     */
    public java.util.List < FieldValueList> getFieldValueList() {
        return this.fieldValueList;
    }

    /**
     * @return parent
     */
    public String getParent() {
        return this.parent;
    }

    /**
     * @return participant
     */
    public java.util.List < String > getParticipant() {
        return this.participant;
    }

    /**
     * @return space
     */
    public String getSpace() {
        return this.space;
    }

    /**
     * @return spaceIdentifier
     */
    public String getSpaceIdentifier() {
        return this.spaceIdentifier;
    }

    /**
     * @return spaceType
     */
    public String getSpaceType() {
        return this.spaceType;
    }

    /**
     * @return sprint
     */
    public java.util.List < String > getSprint() {
        return this.sprint;
    }

    /**
     * @return subject
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * @return tracker
     */
    public java.util.List < String > getTracker() {
        return this.tracker;
    }

    /**
     * @return verifier
     */
    public java.util.List < String > getVerifier() {
        return this.verifier;
    }

    /**
     * @return workitemType
     */
    public String getWorkitemType() {
        return this.workitemType;
    }

    public static final class Builder extends Request.Builder<CreateWorkitemRequest, Builder> {
        private String organizationId; 
        private String assignedTo; 
        private String category; 
        private String description; 
        private String descriptionFormat; 
        private java.util.List < FieldValueList> fieldValueList; 
        private String parent; 
        private java.util.List < String > participant; 
        private String space; 
        private String spaceIdentifier; 
        private String spaceType; 
        private java.util.List < String > sprint; 
        private String subject; 
        private java.util.List < String > tracker; 
        private java.util.List < String > verifier; 
        private String workitemType; 

        private Builder() {
            super();
        } 

        private Builder(CreateWorkitemRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.assignedTo = request.assignedTo;
            this.category = request.category;
            this.description = request.description;
            this.descriptionFormat = request.descriptionFormat;
            this.fieldValueList = request.fieldValueList;
            this.parent = request.parent;
            this.participant = request.participant;
            this.space = request.space;
            this.spaceIdentifier = request.spaceIdentifier;
            this.spaceType = request.spaceType;
            this.sprint = request.sprint;
            this.subject = request.subject;
            this.tracker = request.tracker;
            this.verifier = request.verifier;
            this.workitemType = request.workitemType;
        } 

        /**
         * 企业id
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * 工作项负责人的account id，或者企业中的用户名
         */
        public Builder assignedTo(String assignedTo) {
            this.putBodyParameter("assignedTo", assignedTo);
            this.assignedTo = assignedTo;
            return this;
        }

        /**
         * 工作项的类型id，比如：Bug、Task对应id
         */
        public Builder category(String category) {
            this.putBodyParameter("category", category);
            this.category = category;
            return this;
        }

        /**
         * 工作项内容
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * 内容格式
         */
        public Builder descriptionFormat(String descriptionFormat) {
            this.putBodyParameter("descriptionFormat", descriptionFormat);
            this.descriptionFormat = descriptionFormat;
            return this;
        }

        /**
         * 自定义字段
         */
        public Builder fieldValueList(java.util.List < FieldValueList> fieldValueList) {
            this.putBodyParameter("fieldValueList", fieldValueList);
            this.fieldValueList = fieldValueList;
            return this;
        }

        /**
         * 所属父工作项的唯一标识
         */
        public Builder parent(String parent) {
            this.putBodyParameter("parent", parent);
            this.parent = parent;
            return this;
        }

        /**
         * 参与人account id列表，或者企业名称列表
         */
        public Builder participant(java.util.List < String > participant) {
            this.putBodyParameter("participant", participant);
            this.participant = participant;
            return this;
        }

        /**
         * 项目id
         */
        public Builder space(String space) {
            this.putBodyParameter("space", space);
            this.space = space;
            return this;
        }

        /**
         * 项目id
         */
        public Builder spaceIdentifier(String spaceIdentifier) {
            this.putBodyParameter("spaceIdentifier", spaceIdentifier);
            this.spaceIdentifier = spaceIdentifier;
            return this;
        }

        /**
         * 资源类型
         */
        public Builder spaceType(String spaceType) {
            this.putBodyParameter("spaceType", spaceType);
            this.spaceType = spaceType;
            return this;
        }

        /**
         * 要关联迭代
         */
        public Builder sprint(java.util.List < String > sprint) {
            this.putBodyParameter("sprint", sprint);
            this.sprint = sprint;
            return this;
        }

        /**
         * 标题
         */
        public Builder subject(String subject) {
            this.putBodyParameter("subject", subject);
            this.subject = subject;
            return this;
        }

        /**
         * 抄送人account id列表
         */
        public Builder tracker(java.util.List < String > tracker) {
            this.putBodyParameter("tracker", tracker);
            this.tracker = tracker;
            return this;
        }

        /**
         * 验证者account id列表，或者企业名称列表
         */
        public Builder verifier(java.util.List < String > verifier) {
            this.putBodyParameter("verifier", verifier);
            this.verifier = verifier;
            return this;
        }

        /**
         * 工作项小类型id
         */
        public Builder workitemType(String workitemType) {
            this.putBodyParameter("workitemType", workitemType);
            this.workitemType = workitemType;
            return this;
        }

        @Override
        public CreateWorkitemRequest build() {
            return new CreateWorkitemRequest(this);
        } 

    } 

    public static class FieldValueList extends TeaModel {
        @NameInMap("fieldIdentifier")
        private String fieldIdentifier;

        @NameInMap("value")
        private String value;

        @NameInMap("workitemIdentifier")
        private String workitemIdentifier;

        private FieldValueList(Builder builder) {
            this.fieldIdentifier = builder.fieldIdentifier;
            this.value = builder.value;
            this.workitemIdentifier = builder.workitemIdentifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FieldValueList create() {
            return builder().build();
        }

        /**
         * @return fieldIdentifier
         */
        public String getFieldIdentifier() {
            return this.fieldIdentifier;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return workitemIdentifier
         */
        public String getWorkitemIdentifier() {
            return this.workitemIdentifier;
        }

        public static final class Builder {
            private String fieldIdentifier; 
            private String value; 
            private String workitemIdentifier; 

            /**
             * 字段唯一标识
             */
            public Builder fieldIdentifier(String fieldIdentifier) {
                this.fieldIdentifier = fieldIdentifier;
                return this;
            }

            /**
             * 字段值，写入时使用
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * 工作项的唯一标识
             */
            public Builder workitemIdentifier(String workitemIdentifier) {
                this.workitemIdentifier = workitemIdentifier;
                return this;
            }

            public FieldValueList build() {
                return new FieldValueList(this);
            } 

        } 

    }
}
