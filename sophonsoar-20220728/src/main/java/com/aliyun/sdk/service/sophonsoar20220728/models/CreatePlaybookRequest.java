// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
 * {@link CreatePlaybookRequest} extends {@link RequestModel}
 *
 * <p>CreatePlaybookRequest</p>
 */
public class CreatePlaybookRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InputParams")
    private String inputParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OutputParams")
    private String outputParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskflowType")
    private String taskflowType;

    private CreatePlaybookRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.inputParams = builder.inputParams;
        this.lang = builder.lang;
        this.outputParams = builder.outputParams;
        this.taskflowType = builder.taskflowType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePlaybookRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return inputParams
     */
    public String getInputParams() {
        return this.inputParams;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return outputParams
     */
    public String getOutputParams() {
        return this.outputParams;
    }

    /**
     * @return taskflowType
     */
    public String getTaskflowType() {
        return this.taskflowType;
    }

    public static final class Builder extends Request.Builder<CreatePlaybookRequest, Builder> {
        private String description; 
        private String displayName; 
        private String inputParams; 
        private String lang; 
        private String outputParams; 
        private String taskflowType; 

        private Builder() {
            super();
        } 

        private Builder(CreatePlaybookRequest request) {
            super(request);
            this.description = request.description;
            this.displayName = request.displayName;
            this.inputParams = request.inputParams;
            this.lang = request.lang;
            this.outputParams = request.outputParams;
            this.taskflowType = request.taskflowType;
        } 

        /**
         * <p>Description of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a new version</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Name of the playbook.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test09</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * InputParams.
         */
        public Builder inputParams(String inputParams) {
            this.putBodyParameter("InputParams", inputParams);
            this.inputParams = inputParams;
            return this;
        }

        /**
         * <p>Language type for receiving messages. Values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * OutputParams.
         */
        public Builder outputParams(String outputParams) {
            this.putBodyParameter("OutputParams", outputParams);
            this.outputParams = outputParams;
            return this;
        }

        /**
         * <p>Playbook TaskFlow type.</p>
         * <ul>
         * <li><strong>x6</strong> : x6</li>
         * <li><strong>bpmn</strong>: bpmn</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>x6</p>
         */
        public Builder taskflowType(String taskflowType) {
            this.putBodyParameter("TaskflowType", taskflowType);
            this.taskflowType = taskflowType;
            return this;
        }

        @Override
        public CreatePlaybookRequest build() {
            return new CreatePlaybookRequest(this);
        } 

    } 

}
