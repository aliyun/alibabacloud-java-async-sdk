// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddImageVulWhiteListRequest} extends {@link RequestModel}
 *
 * <p>AddImageVulWhiteListRequest</p>
 */
public class AddImageVulWhiteListRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Whitelist")
    private String whitelist;

    private AddImageVulWhiteListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.reason = builder.reason;
        this.source = builder.source;
        this.target = builder.target;
        this.type = builder.type;
        this.whitelist = builder.whitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddImageVulWhiteListRequest create() {
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return whitelist
     */
    public String getWhitelist() {
        return this.whitelist;
    }

    public static final class Builder extends Request.Builder<AddImageVulWhiteListRequest, Builder> {
        private String lang; 
        private String reason; 
        private String source; 
        private String target; 
        private String type; 
        private String whitelist; 

        private Builder() {
            super();
        } 

        private Builder(AddImageVulWhiteListRequest request) {
            super(request);
            this.lang = request.lang;
            this.reason = request.reason;
            this.source = request.source;
            this.target = request.target;
            this.type = request.type;
            this.whitelist = request.whitelist;
        } 

        /**
         * <p>The language of the content within the request and response. Default value: zh. Valid values:</p>
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
         * <p>already config in another way</p>
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
         * <p>The object on which you want to perform the operation. The value of this parameter is in the JSON format and contains the following fields:</p>
         * <ul>
         * <li><strong>type</strong>: the object type. The value is fixed to repo.</li>
         * <li><strong>target</strong>: the object content. The value is in the Namespace/Image repository format.</li>
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

        /**
         * <p>The type of the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: system vulnerability</li>
         * <li><strong>sca</strong>: application vulnerability</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cve</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The whitelist. The value of this parameter is in the JSON format and contains the following fields:</p>
         * <ul>
         * <li><strong>Type</strong>: the vulnerability type. Valid values: cve and sca.</li>
         * <li><strong>Name</strong>: the name of the vulnerability that is specified in Common Vulnerabilities and Exposures (CVE).</li>
         * <li><strong>AliasName</strong>: the alias of the vulnerability that is specified in CVE.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Type&quot;:&quot;sca&quot;,&quot;Name&quot;:&quot;imgsca:java:spring-core:AVD-2022-1124599&quot;,&quot;AliasName&quot;:&quot;Spring Framework JDK &gt;= 9 (CVE-2022-22965)&quot;}]</p>
         */
        public Builder whitelist(String whitelist) {
            this.putQueryParameter("Whitelist", whitelist);
            this.whitelist = whitelist;
            return this;
        }

        @Override
        public AddImageVulWhiteListRequest build() {
            return new AddImageVulWhiteListRequest(this);
        } 

    } 

}
