// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link CreateWorkitemRecordRequest} extends {@link RequestModel}
 *
 * <p>CreateWorkitemRecordRequest</p>
 */
public class CreateWorkitemRecordRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("actualTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String actualTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gmtEnd")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gmtEnd;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gmtStart")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gmtStart;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("recordUserIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String recordUserIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workitemIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workitemIdentifier;

    private CreateWorkitemRecordRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.actualTime = builder.actualTime;
        this.description = builder.description;
        this.gmtEnd = builder.gmtEnd;
        this.gmtStart = builder.gmtStart;
        this.recordUserIdentifier = builder.recordUserIdentifier;
        this.type = builder.type;
        this.workitemIdentifier = builder.workitemIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkitemRecordRequest create() {
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
     * @return actualTime
     */
    public String getActualTime() {
        return this.actualTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return gmtEnd
     */
    public String getGmtEnd() {
        return this.gmtEnd;
    }

    /**
     * @return gmtStart
     */
    public String getGmtStart() {
        return this.gmtStart;
    }

    /**
     * @return recordUserIdentifier
     */
    public String getRecordUserIdentifier() {
        return this.recordUserIdentifier;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return workitemIdentifier
     */
    public String getWorkitemIdentifier() {
        return this.workitemIdentifier;
    }

    public static final class Builder extends Request.Builder<CreateWorkitemRecordRequest, Builder> {
        private String organizationId; 
        private String actualTime; 
        private String description; 
        private String gmtEnd; 
        private String gmtStart; 
        private String recordUserIdentifier; 
        private String type; 
        private String workitemIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(CreateWorkitemRecordRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.actualTime = request.actualTime;
            this.description = request.description;
            this.gmtEnd = request.gmtEnd;
            this.gmtStart = request.gmtStart;
            this.recordUserIdentifier = request.recordUserIdentifier;
            this.type = request.type;
            this.workitemIdentifier = request.workitemIdentifier;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1e9903d8b3f1xxxxxf9286ef5</p>
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder actualTime(String actualTime) {
            this.putBodyParameter("actualTime", actualTime);
            this.actualTime = actualTime;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1646323200000</p>
         */
        public Builder gmtEnd(String gmtEnd) {
            this.putBodyParameter("gmtEnd", gmtEnd);
            this.gmtEnd = gmtEnd;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1667205617061</p>
         */
        public Builder gmtStart(String gmtStart) {
            this.putBodyParameter("gmtStart", gmtStart);
            this.gmtStart = gmtStart;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1316458xxxxx41068</p>
         */
        public Builder recordUserIdentifier(String recordUserIdentifier) {
            this.putBodyParameter("recordUserIdentifier", recordUserIdentifier);
            this.recordUserIdentifier = recordUserIdentifier;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>deafe5f33xxxxx6a259d8dafd</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9144ef6b72d8exxxxx9e61a4d0</p>
         */
        public Builder workitemIdentifier(String workitemIdentifier) {
            this.putBodyParameter("workitemIdentifier", workitemIdentifier);
            this.workitemIdentifier = workitemIdentifier;
            return this;
        }

        @Override
        public CreateWorkitemRecordRequest build() {
            return new CreateWorkitemRecordRequest(this);
        } 

    } 

}
