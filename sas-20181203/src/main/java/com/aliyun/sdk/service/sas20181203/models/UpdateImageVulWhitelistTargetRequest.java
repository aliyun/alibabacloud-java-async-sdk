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
 * {@link UpdateImageVulWhitelistTargetRequest} extends {@link RequestModel}
 *
 * <p>UpdateImageVulWhitelistTargetRequest</p>
 */
public class UpdateImageVulWhitelistTargetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Target")
    private String target;

    private UpdateImageVulWhitelistTargetRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.lang = builder.lang;
        this.reason = builder.reason;
        this.source = builder.source;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateImageVulWhitelistTargetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    public static final class Builder extends Request.Builder<UpdateImageVulWhitelistTargetRequest, Builder> {
        private Long id; 
        private String lang; 
        private String reason; 
        private String source; 
        private String target; 

        private Builder() {
            super();
        } 

        private Builder(UpdateImageVulWhitelistTargetRequest request) {
            super(request);
            this.id = request.id;
            this.lang = request.lang;
            this.reason = request.reason;
            this.source = request.source;
            this.target = request.target;
        } 

        /**
         * <p>The whitelist ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2000083</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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
         * <p>The reason why you add the vulnerability to the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>ignore</p>
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * <p>The source of the whitelist. Valid values:</p>
         * <ul>
         * <li><strong>image</strong></li>
         * <li><strong>agentless</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The vulnerability that you want to add to the whitelist. The value of this parameter is in the JSON format and contains the following fields:</p>
         * <ul>
         * <li><strong>type</strong>: The type of the vulnerability. The value is fixed to repo.</li>
         * <li><strong>target</strong>: The content of the vulnerability. The value is in the format of Namespace/Image repository.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;repo&quot;,&quot;target&quot;:[&quot;sas_test/script_0209&quot;,&quot;sas_test/script&quot;]}</p>
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        @Override
        public UpdateImageVulWhitelistTargetRequest build() {
            return new UpdateImageVulWhitelistTargetRequest(this);
        } 

    } 

}
