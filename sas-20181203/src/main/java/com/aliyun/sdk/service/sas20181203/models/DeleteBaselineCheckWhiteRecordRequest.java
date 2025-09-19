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
 * {@link DeleteBaselineCheckWhiteRecordRequest} extends {@link RequestModel}
 *
 * <p>DeleteBaselineCheckWhiteRecordRequest</p>
 */
public class DeleteBaselineCheckWhiteRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckIds")
    private java.util.List<Long> checkIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordIds")
    private java.util.List<Long> recordIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    private DeleteBaselineCheckWhiteRecordRequest(Builder builder) {
        super(builder);
        this.checkIds = builder.checkIds;
        this.lang = builder.lang;
        this.recordIds = builder.recordIds;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBaselineCheckWhiteRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkIds
     */
    public java.util.List<Long> getCheckIds() {
        return this.checkIds;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return recordIds
     */
    public java.util.List<Long> getRecordIds() {
        return this.recordIds;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<DeleteBaselineCheckWhiteRecordRequest, Builder> {
        private java.util.List<Long> checkIds; 
        private String lang; 
        private java.util.List<Long> recordIds; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBaselineCheckWhiteRecordRequest request) {
            super(request);
            this.checkIds = request.checkIds;
            this.lang = request.lang;
            this.recordIds = request.recordIds;
            this.source = request.source;
        } 

        /**
         * <p>The IDs of check items.</p>
         */
        public Builder checkIds(java.util.List<Long> checkIds) {
            this.putQueryParameter("CheckIds", checkIds);
            this.checkIds = checkIds;
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
         * <p>The IDs of the whitelist records.</p>
         */
        public Builder recordIds(java.util.List<Long> recordIds) {
            this.putQueryParameter("RecordIds", recordIds);
            this.recordIds = recordIds;
            return this;
        }

        /**
         * <p>The data source. Valid values:</p>
         * <ul>
         * <li><strong>default</strong>: host baseline</li>
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

        @Override
        public DeleteBaselineCheckWhiteRecordRequest build() {
            return new DeleteBaselineCheckWhiteRecordRequest(this);
        } 

    } 

}
