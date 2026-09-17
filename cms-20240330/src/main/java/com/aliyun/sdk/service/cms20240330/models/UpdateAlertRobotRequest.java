// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link UpdateAlertRobotRequest} extends {@link RequestModel}
 *
 * <p>UpdateAlertRobotRequest</p>
 */
public class UpdateAlertRobotRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("robotId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String robotId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("digitalEmployeeName")
    private String digitalEmployeeName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("robotSignKey")
    private String robotSignKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("url")
    private String url;

    private UpdateAlertRobotRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.robotId = builder.robotId;
        this.digitalEmployeeName = builder.digitalEmployeeName;
        this.lang = builder.lang;
        this.name = builder.name;
        this.robotSignKey = builder.robotSignKey;
        this.type = builder.type;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAlertRobotRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return robotId
     */
    public String getRobotId() {
        return this.robotId;
    }

    /**
     * @return digitalEmployeeName
     */
    public String getDigitalEmployeeName() {
        return this.digitalEmployeeName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return robotSignKey
     */
    public String getRobotSignKey() {
        return this.robotSignKey;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<UpdateAlertRobotRequest, Builder> {
        private String regionId; 
        private String robotId; 
        private String digitalEmployeeName; 
        private String lang; 
        private String name; 
        private String robotSignKey; 
        private String type; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAlertRobotRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.robotId = request.robotId;
            this.digitalEmployeeName = request.digitalEmployeeName;
            this.lang = request.lang;
            this.name = request.name;
            this.robotSignKey = request.robotSignKey;
            this.type = request.type;
            this.url = request.url;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The unique ID of the robot.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>robotId-cs-api-test</p>
         */
        public Builder robotId(String robotId) {
            this.putPathParameter("robotId", robotId);
            this.robotId = robotId;
            return this;
        }

        /**
         * <p>The name of the digital employee.</p>
         * 
         * <strong>example:</strong>
         * <p>apsara-ops</p>
         */
        public Builder digitalEmployeeName(String digitalEmployeeName) {
            this.putBodyParameter("digitalEmployeeName", digitalEmployeeName);
            this.digitalEmployeeName = digitalEmployeeName;
            return this;
        }

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>zh_CN</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The name of the robot.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The signature key of the robot.</p>
         * 
         * <strong>example:</strong>
         * <p>abc123</p>
         */
        public Builder robotSignKey(String robotSignKey) {
            this.putBodyParameter("robotSignKey", robotSignKey);
            this.robotSignKey = robotSignKey;
            return this;
        }

        /**
         * <p>The type of the robot.</p>
         * 
         * <strong>example:</strong>
         * <p>DING</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The webhook URL of the robot.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=">https://oapi.dingtalk.com/robot/send?access_token=</a>**************</p>
         */
        public Builder url(String url) {
            this.putBodyParameter("url", url);
            this.url = url;
            return this;
        }

        @Override
        public UpdateAlertRobotRequest build() {
            return new UpdateAlertRobotRequest(this);
        } 

    } 

}
