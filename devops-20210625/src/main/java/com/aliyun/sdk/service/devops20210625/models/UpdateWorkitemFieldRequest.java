// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWorkitemFieldRequest} extends {@link RequestModel}
 *
 * <p>UpdateWorkitemFieldRequest</p>
 */
public class UpdateWorkitemFieldRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Body
    @NameInMap("updateWorkitemPropertyRequest")
    @Validation(required = true)
    private java.util.List < UpdateWorkitemPropertyRequest> updateWorkitemPropertyRequest;

    @Body
    @NameInMap("workitemIdentifier")
    @Validation(required = true)
    private String workitemIdentifier;

    private UpdateWorkitemFieldRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.updateWorkitemPropertyRequest = builder.updateWorkitemPropertyRequest;
        this.workitemIdentifier = builder.workitemIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkitemFieldRequest create() {
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
     * @return updateWorkitemPropertyRequest
     */
    public java.util.List < UpdateWorkitemPropertyRequest> getUpdateWorkitemPropertyRequest() {
        return this.updateWorkitemPropertyRequest;
    }

    /**
     * @return workitemIdentifier
     */
    public String getWorkitemIdentifier() {
        return this.workitemIdentifier;
    }

    public static final class Builder extends Request.Builder<UpdateWorkitemFieldRequest, Builder> {
        private String organizationId; 
        private java.util.List < UpdateWorkitemPropertyRequest> updateWorkitemPropertyRequest; 
        private String workitemIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWorkitemFieldRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.updateWorkitemPropertyRequest = request.updateWorkitemPropertyRequest;
            this.workitemIdentifier = request.workitemIdentifier;
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
         * 更新工作项属性请求，数组形式
         */
        public Builder updateWorkitemPropertyRequest(java.util.List < UpdateWorkitemPropertyRequest> updateWorkitemPropertyRequest) {
            this.putBodyParameter("updateWorkitemPropertyRequest", updateWorkitemPropertyRequest);
            this.updateWorkitemPropertyRequest = updateWorkitemPropertyRequest;
            return this;
        }

        /**
         * 工作项id，同workitemId，工作项唯一标识
         */
        public Builder workitemIdentifier(String workitemIdentifier) {
            this.putBodyParameter("workitemIdentifier", workitemIdentifier);
            this.workitemIdentifier = workitemIdentifier;
            return this;
        }

        @Override
        public UpdateWorkitemFieldRequest build() {
            return new UpdateWorkitemFieldRequest(this);
        } 

    } 

    public static class UpdateWorkitemPropertyRequest extends TeaModel {
        @NameInMap("fieldIdentifier")
        @Validation(required = true)
        private String fieldIdentifier;

        @NameInMap("fieldValue")
        @Validation(required = true)
        private String fieldValue;

        private UpdateWorkitemPropertyRequest(Builder builder) {
            this.fieldIdentifier = builder.fieldIdentifier;
            this.fieldValue = builder.fieldValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateWorkitemPropertyRequest create() {
            return builder().build();
        }

        /**
         * @return fieldIdentifier
         */
        public String getFieldIdentifier() {
            return this.fieldIdentifier;
        }

        /**
         * @return fieldValue
         */
        public String getFieldValue() {
            return this.fieldValue;
        }

        public static final class Builder {
            private String fieldIdentifier; 
            private String fieldValue; 

            /**
             * 需要更新的工作项字段id，可以从获取工作项所有字段接口获取相应的数据
             */
            public Builder fieldIdentifier(String fieldIdentifier) {
                this.fieldIdentifier = fieldIdentifier;
                return this;
            }

            /**
             * 需要更新字段的属性值 (注：1.如果是人员类型的值必须要填写aliyunPK。2.如果是含有待选值的字段，填写相应的待选值的id。 3.如果多个值，需要用" , "进行分割，拼接成一个字符串。
             */
            public Builder fieldValue(String fieldValue) {
                this.fieldValue = fieldValue;
                return this;
            }

            public UpdateWorkitemPropertyRequest build() {
                return new UpdateWorkitemPropertyRequest(this);
            } 

        } 

    }
}
