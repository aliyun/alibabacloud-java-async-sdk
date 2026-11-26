// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link QueryScriptHotWordListRequest} extends {@link RequestModel}
 *
 * <p>QueryScriptHotWordListRequest</p>
 */
public class QueryScriptHotWordListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("hotWord")
    private String hotWord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scriptRecordId")
    private String scriptRecordId;

    private QueryScriptHotWordListRequest(Builder builder) {
        super(builder);
        this.hotWord = builder.hotWord;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.scriptRecordId = builder.scriptRecordId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryScriptHotWordListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hotWord
     */
    public String getHotWord() {
        return this.hotWord;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return scriptRecordId
     */
    public String getScriptRecordId() {
        return this.scriptRecordId;
    }

    public static final class Builder extends Request.Builder<QueryScriptHotWordListRequest, Builder> {
        private String hotWord; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String scriptRecordId; 

        private Builder() {
            super();
        } 

        private Builder(QueryScriptHotWordListRequest request) {
            super(request);
            this.hotWord = request.hotWord;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.scriptRecordId = request.scriptRecordId;
        } 

        /**
         * hotWord.
         */
        public Builder hotWord(String hotWord) {
            this.putQueryParameter("hotWord", hotWord);
            this.hotWord = hotWord;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * scriptRecordId.
         */
        public Builder scriptRecordId(String scriptRecordId) {
            this.putQueryParameter("scriptRecordId", scriptRecordId);
            this.scriptRecordId = scriptRecordId;
            return this;
        }

        @Override
        public QueryScriptHotWordListRequest build() {
            return new QueryScriptHotWordListRequest(this);
        } 

    } 

}
