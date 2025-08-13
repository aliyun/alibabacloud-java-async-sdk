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
 * {@link DeleteSampleBatchMetaRequest} extends {@link RequestModel}
 *
 * <p>DeleteSampleBatchMetaRequest</p>
 */
public class DeleteSampleBatchMetaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("batchUuid")
    private String batchUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private DeleteSampleBatchMetaRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.batchUuid = builder.batchUuid;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSampleBatchMetaRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteSampleBatchMetaRequest, Builder> {
        private String lang; 
        private String batchUuid; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSampleBatchMetaRequest request) {
            super(request);
            this.lang = request.lang;
            this.batchUuid = request.batchUuid;
            this.regId = request.regId;
        } 

        /**
         * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values: </p>
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
         * <p>UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>jigaklba83ka</p>
         */
        public Builder batchUuid(String batchUuid) {
            this.putQueryParameter("batchUuid", batchUuid);
            this.batchUuid = batchUuid;
            return this;
        }

        /**
         * <p>Region code.</p>
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
        public DeleteSampleBatchMetaRequest build() {
            return new DeleteSampleBatchMetaRequest(this);
        } 

    } 

}
