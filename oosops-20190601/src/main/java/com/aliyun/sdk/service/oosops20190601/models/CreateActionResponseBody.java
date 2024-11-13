// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateActionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateActionResponseBody</p>
 */
public class CreateActionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActionName")
    private String actionName;

    @com.aliyun.core.annotation.NameInMap("ActionType")
    private String actionType;

    @com.aliyun.core.annotation.NameInMap("CreatedDate")
    private String createdDate;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Popularity")
    private Integer popularity;

    @com.aliyun.core.annotation.NameInMap("Properties")
    private String properties;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TemplateVersion")
    private String templateVersion;

    private CreateActionResponseBody(Builder builder) {
        this.actionName = builder.actionName;
        this.actionType = builder.actionType;
        this.createdDate = builder.createdDate;
        this.description = builder.description;
        this.popularity = builder.popularity;
        this.properties = builder.properties;
        this.requestId = builder.requestId;
        this.templateVersion = builder.templateVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateActionResponseBody create() {
        return builder().build();
    }

    /**
     * @return actionName
     */
    public String getActionName() {
        return this.actionName;
    }

    /**
     * @return actionType
     */
    public String getActionType() {
        return this.actionType;
    }

    /**
     * @return createdDate
     */
    public String getCreatedDate() {
        return this.createdDate;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return popularity
     */
    public Integer getPopularity() {
        return this.popularity;
    }

    /**
     * @return properties
     */
    public String getProperties() {
        return this.properties;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templateVersion
     */
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static final class Builder {
        private String actionName; 
        private String actionType; 
        private String createdDate; 
        private String description; 
        private Integer popularity; 
        private String properties; 
        private String requestId; 
        private String templateVersion; 

        /**
         * ActionName.
         */
        public Builder actionName(String actionName) {
            this.actionName = actionName;
            return this;
        }

        /**
         * ActionType.
         */
        public Builder actionType(String actionType) {
            this.actionType = actionType;
            return this;
        }

        /**
         * CreatedDate.
         */
        public Builder createdDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Popularity.
         */
        public Builder popularity(Integer popularity) {
            this.popularity = popularity;
            return this;
        }

        /**
         * Properties.
         */
        public Builder properties(String properties) {
            this.properties = properties;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TemplateVersion.
         */
        public Builder templateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }

        public CreateActionResponseBody build() {
            return new CreateActionResponseBody(this);
        } 

    } 

}
