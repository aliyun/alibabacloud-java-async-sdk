// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link GetLineSplitResultRequest} extends {@link RequestModel}
 *
 * <p>GetLineSplitResultRequest</p>
 */
public class GetLineSplitResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Line")
    private String line;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Prefix")
    private String prefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Regex")
    private String regex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SelectContent")
    private String selectContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SplitType")
    private String splitType;

    private GetLineSplitResultRequest(Builder builder) {
        super(builder);
        this.line = builder.line;
        this.prefix = builder.prefix;
        this.regex = builder.regex;
        this.selectContent = builder.selectContent;
        this.splitType = builder.splitType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLineSplitResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return line
     */
    public String getLine() {
        return this.line;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * @return regex
     */
    public String getRegex() {
        return this.regex;
    }

    /**
     * @return selectContent
     */
    public String getSelectContent() {
        return this.selectContent;
    }

    /**
     * @return splitType
     */
    public String getSplitType() {
        return this.splitType;
    }

    public static final class Builder extends Request.Builder<GetLineSplitResultRequest, Builder> {
        private String line; 
        private String prefix; 
        private String regex; 
        private String selectContent; 
        private String splitType; 

        private Builder() {
            super();
        } 

        private Builder(GetLineSplitResultRequest request) {
            super(request);
            this.line = request.line;
            this.prefix = request.prefix;
            this.regex = request.regex;
            this.selectContent = request.selectContent;
            this.splitType = request.splitType;
        } 

        /**
         * Line.
         */
        public Builder line(String line) {
            this.putQueryParameter("Line", line);
            this.line = line;
            return this;
        }

        /**
         * Prefix.
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("Prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        /**
         * Regex.
         */
        public Builder regex(String regex) {
            this.putQueryParameter("Regex", regex);
            this.regex = regex;
            return this;
        }

        /**
         * SelectContent.
         */
        public Builder selectContent(String selectContent) {
            this.putQueryParameter("SelectContent", selectContent);
            this.selectContent = selectContent;
            return this;
        }

        /**
         * SplitType.
         */
        public Builder splitType(String splitType) {
            this.putQueryParameter("SplitType", splitType);
            this.splitType = splitType;
            return this;
        }

        @Override
        public GetLineSplitResultRequest build() {
            return new GetLineSplitResultRequest(this);
        } 

    } 

}
