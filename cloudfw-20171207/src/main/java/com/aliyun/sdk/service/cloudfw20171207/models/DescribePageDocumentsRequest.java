// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribePageDocumentsRequest} extends {@link RequestModel}
 *
 * <p>DescribePageDocumentsRequest</p>
 */
public class DescribePageDocumentsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TabName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tabName;

    private DescribePageDocumentsRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.pageName = builder.pageName;
        this.sourceCode = builder.sourceCode;
        this.sourceIp = builder.sourceIp;
        this.tabName = builder.tabName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePageDocumentsRequest create() {
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
     * @return pageName
     */
    public String getPageName() {
        return this.pageName;
    }

    /**
     * @return sourceCode
     */
    public String getSourceCode() {
        return this.sourceCode;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return tabName
     */
    public String getTabName() {
        return this.tabName;
    }

    public static final class Builder extends Request.Builder<DescribePageDocumentsRequest, Builder> {
        private String lang; 
        private String pageName; 
        private String sourceCode; 
        private String sourceIp; 
        private String tabName; 

        private Builder() {
            super();
        } 

        private Builder(DescribePageDocumentsRequest request) {
            super(request);
            this.lang = request.lang;
            this.pageName = request.pageName;
            this.sourceCode = request.sourceCode;
            this.sourceIp = request.sourceIp;
            this.tabName = request.tabName;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>overview</p>
         */
        public Builder pageName(String pageName) {
            this.putQueryParameter("PageName", pageName);
            this.pageName = pageName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yundun</p>
         */
        public Builder sourceCode(String sourceCode) {
            this.putQueryParameter("SourceCode", sourceCode);
            this.sourceCode = sourceCode;
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

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>internet</p>
         */
        public Builder tabName(String tabName) {
            this.putQueryParameter("TabName", tabName);
            this.tabName = tabName;
            return this;
        }

        @Override
        public DescribePageDocumentsRequest build() {
            return new DescribePageDocumentsRequest(this);
        } 

    } 

}
