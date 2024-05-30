// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMatchedMaliciousNamesRequest} extends {@link RequestModel}
 *
 * <p>DescribeMatchedMaliciousNamesRequest</p>
 */
public class DescribeMatchedMaliciousNamesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Levels")
    private String levels;

    private DescribeMatchedMaliciousNamesRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.levels = builder.levels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMatchedMaliciousNamesRequest create() {
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
     * @return levels
     */
    public String getLevels() {
        return this.levels;
    }

    public static final class Builder extends Request.Builder<DescribeMatchedMaliciousNamesRequest, Builder> {
        private String lang; 
        private String levels; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMatchedMaliciousNamesRequest request) {
            super(request);
            this.lang = request.lang;
            this.levels = request.levels;
        } 

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The severity of the malicious image sample that you want to query. You can enter multiple severities. Separate the severities with commas (,). Valid values:
         * <p>
         * 
         * *   **serious**
         * *   **suspicious**
         * *   **remind**
         */
        public Builder levels(String levels) {
            this.putQueryParameter("Levels", levels);
            this.levels = levels;
            return this;
        }

        @Override
        public DescribeMatchedMaliciousNamesRequest build() {
            return new DescribeMatchedMaliciousNamesRequest(this);
        } 

    } 

}
