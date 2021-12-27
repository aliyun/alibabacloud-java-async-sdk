// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyClearLogstoreStorageRequest} extends {@link RequestModel}
 *
 * <p>ModifyClearLogstoreStorageRequest</p>
 */
public class ModifyClearLogstoreStorageRequest extends Request {
    @Query
    @NameInMap("From")
    private String from;

    @Query
    @NameInMap("Lang")
    private String lang;


    private ModifyClearLogstoreStorageRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyClearLogstoreStorageRequest create() {
        return builder().build();
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String from; 
        private String lang; 

        /**
         * <p>From.</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>Lang.</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        public ModifyClearLogstoreStorageRequest build() {
            return new ModifyClearLogstoreStorageRequest(this);
        } 

    } 

}
