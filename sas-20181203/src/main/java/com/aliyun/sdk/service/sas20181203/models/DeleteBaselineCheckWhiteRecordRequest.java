// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBaselineCheckWhiteRecordRequest} extends {@link RequestModel}
 *
 * <p>DeleteBaselineCheckWhiteRecordRequest</p>
 */
public class DeleteBaselineCheckWhiteRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckIds")
    private java.util.List < Long > checkIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordIds")
    private java.util.List < Long > recordIds;

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
    public java.util.List < Long > getCheckIds() {
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
    public java.util.List < Long > getRecordIds() {
        return this.recordIds;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<DeleteBaselineCheckWhiteRecordRequest, Builder> {
        private java.util.List < Long > checkIds; 
        private String lang; 
        private java.util.List < Long > recordIds; 
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
         * The IDs of check items.
         */
        public Builder checkIds(java.util.List < Long > checkIds) {
            this.putQueryParameter("CheckIds", checkIds);
            this.checkIds = checkIds;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The IDs of the whitelist records.
         */
        public Builder recordIds(java.util.List < Long > recordIds) {
            this.putQueryParameter("RecordIds", recordIds);
            this.recordIds = recordIds;
            return this;
        }

        /**
         * The data source. Valid values:
         * <p>
         * 
         * *   **default**: host baseline
         * *   **agentless**: agentless detection
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
