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
 * {@link MergeDownloadRequest} extends {@link RequestModel}
 *
 * <p>MergeDownloadRequest</p>
 */
public class MergeDownloadRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubTaskIds")
    private String subTaskIds;

    private MergeDownloadRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regId = builder.regId;
        this.subTaskIds = builder.subTaskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MergeDownloadRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return subTaskIds
     */
    public String getSubTaskIds() {
        return this.subTaskIds;
    }

    public static final class Builder extends Request.Builder<MergeDownloadRequest, Builder> {
        private String lang; 
        private String regId; 
        private String subTaskIds; 

        private Builder() {
            super();
        } 

        private Builder(MergeDownloadRequest request) {
            super(request);
            this.lang = request.lang;
            this.regId = request.regId;
            this.subTaskIds = request.subTaskIds;
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
         * RegId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("RegId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * SubTaskIds.
         */
        public Builder subTaskIds(String subTaskIds) {
            this.putQueryParameter("SubTaskIds", subTaskIds);
            this.subTaskIds = subTaskIds;
            return this;
        }

        @Override
        public MergeDownloadRequest build() {
            return new MergeDownloadRequest(this);
        } 

    } 

}
