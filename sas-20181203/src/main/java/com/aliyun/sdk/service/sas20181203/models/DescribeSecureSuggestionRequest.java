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
 * {@link DescribeSecureSuggestionRequest} extends {@link RequestModel}
 *
 * <p>DescribeSecureSuggestionRequest</p>
 */
public class DescribeSecureSuggestionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalType")
    private String calType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private Integer source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private DescribeSecureSuggestionRequest(Builder builder) {
        super(builder);
        this.calType = builder.calType;
        this.lang = builder.lang;
        this.source = builder.source;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecureSuggestionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return calType
     */
    public String getCalType() {
        return this.calType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return source
     */
    public Integer getSource() {
        return this.source;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeSecureSuggestionRequest, Builder> {
        private String calType; 
        private String lang; 
        private Integer source; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSecureSuggestionRequest request) {
            super(request);
            this.calType = request.calType;
            this.lang = request.lang;
            this.source = request.source;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>The old or new version of the security score rule. If you set this parameter to <strong>home_security_score</strong>, the new version of the security score rule is returned. Otherwise, the old version of the security score rule is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>home_security_score</p>
         */
        public Builder calType(String calType) {
            this.putQueryParameter("CalType", calType);
            this.calType = calType;
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
         * <p>Source of security score, default is Cloud Security Center if left empty. Enum values: </p>
         * <ul>
         * <li><p>0:Cloud Security Center. </p>
         * </li>
         * <li><p>1:Yaochi Console.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder source(Integer source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeSecureSuggestionRequest build() {
            return new DescribeSecureSuggestionRequest(this);
        } 

    } 

}
