// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link PocCreateTaskRequest} extends {@link RequestModel}
 *
 * <p>PocCreateTaskRequest</p>
 */
public class PocCreateTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DateFormat")
    private String dateFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    @com.aliyun.core.annotation.Validation(required = true)
    private String token;

    private PocCreateTaskRequest(Builder builder) {
        super(builder);
        this.dateFormat = builder.dateFormat;
        this.lang = builder.lang;
        this.regId = builder.regId;
        this.taskName = builder.taskName;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PocCreateTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dateFormat
     */
    public String getDateFormat() {
        return this.dateFormat;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<PocCreateTaskRequest, Builder> {
        private String dateFormat; 
        private String lang; 
        private String regId; 
        private String taskName; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(PocCreateTaskRequest request) {
            super(request);
            this.dateFormat = request.dateFormat;
            this.lang = request.lang;
            this.regId = request.regId;
            this.taskName = request.taskName;
            this.token = request.token;
        } 

        /**
         * <p>Date format</p>
         * 
         * <strong>example:</strong>
         * <p>yyyyMMdd</p>
         */
        public Builder dateFormat(String dateFormat) {
            this.putQueryParameter("DateFormat", dateFormat);
            this.dateFormat = dateFormat;
            return this;
        }

        /**
         * <p>Set the language type for request and response messages, default value is <strong>zh</strong>. Values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Region code.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("RegId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * <p>Task name.</p>
         * 
         * <strong>example:</strong>
         * <p>o32d1pktx4t</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>Task token.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>68ce949aff6be7f1201eb2f9095ac95f</p>
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public PocCreateTaskRequest build() {
            return new PocCreateTaskRequest(this);
        } 

    } 

}
