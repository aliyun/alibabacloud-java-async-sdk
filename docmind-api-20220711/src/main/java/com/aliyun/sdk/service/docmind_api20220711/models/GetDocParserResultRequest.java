// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220711.models;

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
 * {@link GetDocParserResultRequest} extends {@link RequestModel}
 *
 * <p>GetDocParserResultRequest</p>
 */
public class GetDocParserResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeFields")
    private java.util.List<String> excludeFields;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LayoutNum")
    private Integer layoutNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LayoutStepSize")
    private Integer layoutStepSize;

    private GetDocParserResultRequest(Builder builder) {
        super(builder);
        this.excludeFields = builder.excludeFields;
        this.id = builder.id;
        this.layoutNum = builder.layoutNum;
        this.layoutStepSize = builder.layoutStepSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDocParserResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return excludeFields
     */
    public java.util.List<String> getExcludeFields() {
        return this.excludeFields;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return layoutNum
     */
    public Integer getLayoutNum() {
        return this.layoutNum;
    }

    /**
     * @return layoutStepSize
     */
    public Integer getLayoutStepSize() {
        return this.layoutStepSize;
    }

    public static final class Builder extends Request.Builder<GetDocParserResultRequest, Builder> {
        private java.util.List<String> excludeFields; 
        private String id; 
        private Integer layoutNum; 
        private Integer layoutStepSize; 

        private Builder() {
            super();
        } 

        private Builder(GetDocParserResultRequest request) {
            super(request);
            this.excludeFields = request.excludeFields;
            this.id = request.id;
            this.layoutNum = request.layoutNum;
            this.layoutStepSize = request.layoutStepSize;
        } 

        /**
         * ExcludeFields.
         */
        public Builder excludeFields(java.util.List<String> excludeFields) {
            String excludeFieldsShrink = shrink(excludeFields, "ExcludeFields", "simple");
            this.putQueryParameter("ExcludeFields", excludeFieldsShrink);
            this.excludeFields = excludeFields;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * LayoutNum.
         */
        public Builder layoutNum(Integer layoutNum) {
            this.putQueryParameter("LayoutNum", layoutNum);
            this.layoutNum = layoutNum;
            return this;
        }

        /**
         * LayoutStepSize.
         */
        public Builder layoutStepSize(Integer layoutStepSize) {
            this.putQueryParameter("LayoutStepSize", layoutStepSize);
            this.layoutStepSize = layoutStepSize;
            return this;
        }

        @Override
        public GetDocParserResultRequest build() {
            return new GetDocParserResultRequest(this);
        } 

    } 

}
