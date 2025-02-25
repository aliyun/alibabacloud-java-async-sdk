// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSdkUrlRequest} extends {@link RequestModel}
 *
 * <p>DescribeSdkUrlRequest</p>
 */
public class DescribeSdkUrlRequest extends Request {
    @Query
    @NameInMap("Debug")
    private Boolean debug;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DescribeSdkUrlRequest(Builder builder) {
        super(builder);
        this.debug = builder.debug;
        this.id = builder.id;
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSdkUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return debug
     */
    public Boolean getDebug() {
        return this.debug;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
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

    public static final class Builder extends Request.Builder<DescribeSdkUrlRequest, Builder> {
        private Boolean debug; 
        private Long id; 
        private String lang; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSdkUrlRequest request) {
            super(request);
            this.debug = request.debug;
            this.id = request.id;
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * Debug.
         */
        public Builder debug(Boolean debug) {
            this.putQueryParameter("Debug", debug);
            this.debug = debug;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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
        public DescribeSdkUrlRequest build() {
            return new DescribeSdkUrlRequest(this);
        } 

    } 

}
