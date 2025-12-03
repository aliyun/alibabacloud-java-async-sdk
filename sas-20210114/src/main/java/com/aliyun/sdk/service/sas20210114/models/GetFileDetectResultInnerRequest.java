// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20210114.models;

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
 * {@link GetFileDetectResultInnerRequest} extends {@link RequestModel}
 *
 * <p>GetFileDetectResultInnerRequest</p>
 */
public class GetFileDetectResultInnerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DnaHashKeyList")
    private java.util.List<String> dnaHashKeyList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HashKeyList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> hashKeyList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Level")
    private Integer level;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private Integer type;

    private GetFileDetectResultInnerRequest(Builder builder) {
        super(builder);
        this.dnaHashKeyList = builder.dnaHashKeyList;
        this.hashKeyList = builder.hashKeyList;
        this.level = builder.level;
        this.sourceIp = builder.sourceIp;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileDetectResultInnerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dnaHashKeyList
     */
    public java.util.List<String> getDnaHashKeyList() {
        return this.dnaHashKeyList;
    }

    /**
     * @return hashKeyList
     */
    public java.util.List<String> getHashKeyList() {
        return this.hashKeyList;
    }

    /**
     * @return level
     */
    public Integer getLevel() {
        return this.level;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetFileDetectResultInnerRequest, Builder> {
        private java.util.List<String> dnaHashKeyList; 
        private java.util.List<String> hashKeyList; 
        private Integer level; 
        private String sourceIp; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(GetFileDetectResultInnerRequest request) {
            super(request);
            this.dnaHashKeyList = request.dnaHashKeyList;
            this.hashKeyList = request.hashKeyList;
            this.level = request.level;
            this.sourceIp = request.sourceIp;
            this.type = request.type;
        } 

        /**
         * DnaHashKeyList.
         */
        public Builder dnaHashKeyList(java.util.List<String> dnaHashKeyList) {
            this.putQueryParameter("DnaHashKeyList", dnaHashKeyList);
            this.dnaHashKeyList = dnaHashKeyList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder hashKeyList(java.util.List<String> hashKeyList) {
            this.putQueryParameter("HashKeyList", hashKeyList);
            this.hashKeyList = hashKeyList;
            return this;
        }

        /**
         * Level.
         */
        public Builder level(Integer level) {
            this.putQueryParameter("Level", level);
            this.level = level;
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
         * Type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetFileDetectResultInnerRequest build() {
            return new GetFileDetectResultInnerRequest(this);
        } 

    } 

}
