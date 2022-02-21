// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAccessNumberRequest} extends {@link RequestModel}
 *
 * <p>ListAccessNumberRequest</p>
 */
public class ListAccessNumberRequest extends Request {
    @Body
    @NameInMap("CorpIdList")
    private String corpIdList;

    private ListAccessNumberRequest(Builder builder) {
        super(builder);
        this.corpIdList = builder.corpIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccessNumberRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpIdList
     */
    public String getCorpIdList() {
        return this.corpIdList;
    }

    public static final class Builder extends Request.Builder<ListAccessNumberRequest, Builder> {
        private String corpIdList; 

        private Builder() {
            super();
        } 

        private Builder(ListAccessNumberRequest response) {
            super(response);
            this.corpIdList = response.corpIdList;
        } 

        /**
         * CorpIdList.
         */
        public Builder corpIdList(String corpIdList) {
            this.putBodyParameter("CorpIdList", corpIdList);
            this.corpIdList = corpIdList;
            return this;
        }

        @Override
        public ListAccessNumberRequest build() {
            return new ListAccessNumberRequest(this);
        } 

    } 

}
