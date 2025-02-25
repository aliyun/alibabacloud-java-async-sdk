// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link UpdateBaselineCheckWhiteRecordRequest} extends {@link RequestModel}
 *
 * <p>UpdateBaselineCheckWhiteRecordRequest</p>
 */
public class UpdateBaselineCheckWhiteRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckId")
    private Long checkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordId")
    private Long recordId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    private UpdateBaselineCheckWhiteRecordRequest(Builder builder) {
        super(builder);
        this.checkId = builder.checkId;
        this.lang = builder.lang;
        this.reason = builder.reason;
        this.recordId = builder.recordId;
        this.source = builder.source;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBaselineCheckWhiteRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkId
     */
    public Long getCheckId() {
        return this.checkId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return recordId
     */
    public Long getRecordId() {
        return this.recordId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<UpdateBaselineCheckWhiteRecordRequest, Builder> {
        private Long checkId; 
        private String lang; 
        private String reason; 
        private Long recordId; 
        private String source; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBaselineCheckWhiteRecordRequest request) {
            super(request);
            this.checkId = request.checkId;
            this.lang = request.lang;
            this.reason = request.reason;
            this.recordId = request.recordId;
            this.source = request.source;
            this.targetType = request.targetType;
        } 

        /**
         * <p>The ID of the check item.</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListCheckItemWarningSummary~~">ListCheckItemWarningSummary</a> operation to query the IDs of check items.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder checkId(Long checkId) {
            this.putQueryParameter("CheckId", checkId);
            this.checkId = checkId;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
         * <p>The reason why the check item is added to the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>AutoRun</p>
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * <p>The ID of the whitelist record.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        public Builder recordId(Long recordId) {
            this.putQueryParameter("RecordId", recordId);
            this.recordId = recordId;
            return this;
        }

        /**
         * <p>The data source. Valid values:</p>
         * <ul>
         * <li><strong>default</strong>: server</li>
         * <li><strong>agentless</strong>: agentless detection</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>agentless</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The type of the assets on which the whitelist rule takes effect. Valid values:</p>
         * <ul>
         * <li><strong>all_instance</strong>: all servers</li>
         * <li><strong>instance</strong>: specific servers</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all_instance</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public UpdateBaselineCheckWhiteRecordRequest build() {
            return new UpdateBaselineCheckWhiteRecordRequest(this);
        } 

    } 

}
