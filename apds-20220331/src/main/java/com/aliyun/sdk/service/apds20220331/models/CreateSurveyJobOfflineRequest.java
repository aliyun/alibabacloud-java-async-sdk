// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apds20220331.models;

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
 * {@link CreateSurveyJobOfflineRequest} extends {@link RequestModel}
 *
 * <p>CreateSurveyJobOfflineRequest</p>
 */
public class CreateSurveyJobOfflineRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoConfirm")
    private Boolean autoConfirm;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("channel")
    private String channel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cloudType")
    private String cloudType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileName")
    private String fileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("objectName")
    private String objectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private CreateSurveyJobOfflineRequest(Builder builder) {
        super(builder);
        this.autoConfirm = builder.autoConfirm;
        this.channel = builder.channel;
        this.cloudType = builder.cloudType;
        this.fileName = builder.fileName;
        this.name = builder.name;
        this.objectName = builder.objectName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSurveyJobOfflineRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoConfirm
     */
    public Boolean getAutoConfirm() {
        return this.autoConfirm;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return cloudType
     */
    public String getCloudType() {
        return this.cloudType;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return objectName
     */
    public String getObjectName() {
        return this.objectName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateSurveyJobOfflineRequest, Builder> {
        private Boolean autoConfirm; 
        private String channel; 
        private String cloudType; 
        private String fileName; 
        private String name; 
        private String objectName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSurveyJobOfflineRequest request) {
            super(request);
            this.autoConfirm = request.autoConfirm;
            this.channel = request.channel;
            this.cloudType = request.cloudType;
            this.fileName = request.fileName;
            this.name = request.name;
            this.objectName = request.objectName;
            this.regionId = request.regionId;
        } 

        /**
         * autoConfirm.
         */
        public Builder autoConfirm(Boolean autoConfirm) {
            this.putBodyParameter("autoConfirm", autoConfirm);
            this.autoConfirm = autoConfirm;
            return this;
        }

        /**
         * channel.
         */
        public Builder channel(String channel) {
            this.putBodyParameter("channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * cloudType.
         */
        public Builder cloudType(String cloudType) {
            this.putBodyParameter("cloudType", cloudType);
            this.cloudType = cloudType;
            return this;
        }

        /**
         * fileName.
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("fileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * objectName.
         */
        public Builder objectName(String objectName) {
            this.putBodyParameter("objectName", objectName);
            this.objectName = objectName;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateSurveyJobOfflineRequest build() {
            return new CreateSurveyJobOfflineRequest(this);
        } 

    } 

}
