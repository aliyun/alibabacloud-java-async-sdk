// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link DeleteCloudNotePhrasesRequest} extends {@link RequestModel}
 *
 * <p>DeleteCloudNotePhrasesRequest</p>
 */
public class DeleteCloudNotePhrasesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Phrase")
    @com.aliyun.core.annotation.Validation(required = true)
    private Phrase phrase;

    private DeleteCloudNotePhrasesRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.phrase = builder.phrase;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCloudNotePhrasesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return phrase
     */
    public Phrase getPhrase() {
        return this.phrase;
    }

    public static final class Builder extends Request.Builder<DeleteCloudNotePhrasesRequest, Builder> {
        private String appId; 
        private Phrase phrase; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCloudNotePhrasesRequest request) {
            super(request);
            this.appId = request.appId;
            this.phrase = request.phrase;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ac7N****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder phrase(Phrase phrase) {
            String phraseShrink = shrink(phrase, "Phrase", "json");
            this.putQueryParameter("Phrase", phraseShrink);
            this.phrase = phrase;
            return this;
        }

        @Override
        public DeleteCloudNotePhrasesRequest build() {
            return new DeleteCloudNotePhrasesRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeleteCloudNotePhrasesRequest} extends {@link TeaModel}
     *
     * <p>DeleteCloudNotePhrasesRequest</p>
     */
    public static class Phrase extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        private Phrase(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Phrase create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String id; 

            private Builder() {
            } 

            private Builder(Phrase model) {
                this.id = model.id;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1qasw23ezcsrfsawq</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public Phrase build() {
                return new Phrase(this);
            } 

        } 

    }
}
