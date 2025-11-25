// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link AddAclBackupDataRequest} extends {@link RequestModel}
 *
 * <p>AddAclBackupDataRequest</p>
 */
public class AddAclBackupDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackUpTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backUpTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private AddAclBackupDataRequest(Builder builder) {
        super(builder);
        this.backUpTime = builder.backUpTime;
        this.description = builder.description;
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAclBackupDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backUpTime
     */
    public String getBackUpTime() {
        return this.backUpTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<AddAclBackupDataRequest, Builder> {
        private String backUpTime; 
        private String description; 
        private String lang; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(AddAclBackupDataRequest request) {
            super(request);
            this.backUpTime = request.backUpTime;
            this.description = request.description;
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1743683400</p>
         */
        public Builder backUpTime(String backUpTime) {
            this.putQueryParameter("BackUpTime", backUpTime);
            this.backUpTime = backUpTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public AddAclBackupDataRequest build() {
            return new AddAclBackupDataRequest(this);
        } 

    } 

}
