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
 * {@link DeleteAclBackupDataRequest} extends {@link RequestModel}
 *
 * <p>DeleteAclBackupDataRequest</p>
 */
public class DeleteAclBackupDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackUpTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backUpTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private DeleteAclBackupDataRequest(Builder builder) {
        super(builder);
        this.backUpTime = builder.backUpTime;
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAclBackupDataRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteAclBackupDataRequest, Builder> {
        private String backUpTime; 
        private String lang; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAclBackupDataRequest request) {
            super(request);
            this.backUpTime = request.backUpTime;
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>The time of the backup, specified as a UNIX timestamp (the number of seconds that have elapsed since 00:00:00 UTC on January 1, 1970).</p>
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
         * <p>The language of the request and response. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong> (default): Chinese.</p>
         * </li>
         * <li><p><strong>en</strong>: English.</p>
         * </li>
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
         * <p>The source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DeleteAclBackupDataRequest build() {
            return new DeleteAclBackupDataRequest(this);
        } 

    } 

}
