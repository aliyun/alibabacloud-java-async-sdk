// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryIntentsRequest} extends {@link RequestModel}
 *
 * <p>QueryIntentsRequest</p>
 */
public class QueryIntentsRequest extends Request {
    @Query
    @NameInMap("DialogId")
    @Validation(required = true)
    private Long dialogId;

    @Query
    @NameInMap("IntentName")
    private String intentName;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private QueryIntentsRequest(Builder builder) {
        super(builder);
        this.dialogId = builder.dialogId;
        this.intentName = builder.intentName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryIntentsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dialogId
     */
    public Long getDialogId() {
        return this.dialogId;
    }

    /**
     * @return intentName
     */
    public String getIntentName() {
        return this.intentName;
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

    public static final class Builder extends Request.Builder<QueryIntentsRequest, Builder> {
        private Long dialogId; 
        private String intentName; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(QueryIntentsRequest response) {
            super(response);
            this.dialogId = response.dialogId;
            this.intentName = response.intentName;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
        } 

        /**
         * DialogId.
         */
        public Builder dialogId(Long dialogId) {
            this.putQueryParameter("DialogId", dialogId);
            this.dialogId = dialogId;
            return this;
        }

        /**
         * IntentName.
         */
        public Builder intentName(String intentName) {
            this.putQueryParameter("IntentName", intentName);
            this.intentName = intentName;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public QueryIntentsRequest build() {
            return new QueryIntentsRequest(this);
        } 

    } 

}
