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
 * {@link DownloadSmapleBatchRequest} extends {@link RequestModel}
 *
 * <p>DownloadSmapleBatchRequest</p>
 */
public class DownloadSmapleBatchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("batchUuid")
    private String batchUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private DownloadSmapleBatchRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.batchUuid = builder.batchUuid;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadSmapleBatchRequest create() {
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
     * @return batchUuid
     */
    public String getBatchUuid() {
        return this.batchUuid;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DownloadSmapleBatchRequest, Builder> {
        private String lang; 
        private String batchUuid; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DownloadSmapleBatchRequest request) {
            super(request);
            this.lang = request.lang;
            this.batchUuid = request.batchUuid;
            this.regId = request.regId;
        } 

        /**
         * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
         * <p>Sample batch UUID</p>
         * 
         * <strong>example:</strong>
         * <p>203f1ae65c0a41a49dc4f8a47946caa2</p>
         */
        public Builder batchUuid(String batchUuid) {
            this.putQueryParameter("batchUuid", batchUuid);
            this.batchUuid = batchUuid;
            return this;
        }

        /**
         * <p>Region code</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public DownloadSmapleBatchRequest build() {
            return new DownloadSmapleBatchRequest(this);
        } 

    } 

}
