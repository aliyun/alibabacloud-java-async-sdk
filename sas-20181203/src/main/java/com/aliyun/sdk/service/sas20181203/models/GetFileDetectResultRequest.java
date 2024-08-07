// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileDetectResultRequest} extends {@link RequestModel}
 *
 * <p>GetFileDetectResultRequest</p>
 */
public class GetFileDetectResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HashKeyList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > hashKeyList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer type;

    private GetFileDetectResultRequest(Builder builder) {
        super(builder);
        this.hashKeyList = builder.hashKeyList;
        this.sourceIp = builder.sourceIp;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileDetectResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hashKeyList
     */
    public java.util.List < String > getHashKeyList() {
        return this.hashKeyList;
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

    public static final class Builder extends Request.Builder<GetFileDetectResultRequest, Builder> {
        private java.util.List < String > hashKeyList; 
        private String sourceIp; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(GetFileDetectResultRequest request) {
            super(request);
            this.hashKeyList = request.hashKeyList;
            this.sourceIp = request.sourceIp;
            this.type = request.type;
        } 

        /**
         * The identifiers of files. Only MD5 hash values are supported.
         */
        public Builder hashKeyList(java.util.List < String > hashKeyList) {
            this.putQueryParameter("HashKeyList", hashKeyList);
            this.hashKeyList = hashKeyList;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The type of the file. Valid values:
         * <p>
         * 
         * *   **0**: unknown file
         * *   **1**: binary file
         * *   **2**: webshell file
         * *   **4**: script file
         * 
         * > If you do not know the type of the file, set this parameter to 0.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetFileDetectResultRequest build() {
            return new GetFileDetectResultRequest(this);
        } 

    } 

}
