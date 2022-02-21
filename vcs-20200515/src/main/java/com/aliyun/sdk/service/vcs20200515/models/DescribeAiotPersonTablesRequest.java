// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAiotPersonTablesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAiotPersonTablesRequest</p>
 */
public class DescribeAiotPersonTablesRequest extends Request {
    @Body
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Body
    @NameInMap("PersonTableIdList")
    private String personTableIdList;

    private DescribeAiotPersonTablesRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.personTableIdList = builder.personTableIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAiotPersonTablesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return personTableIdList
     */
    public String getPersonTableIdList() {
        return this.personTableIdList;
    }

    public static final class Builder extends Request.Builder<DescribeAiotPersonTablesRequest, Builder> {
        private String id; 
        private String personTableIdList; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAiotPersonTablesRequest response) {
            super(response);
            this.id = response.id;
            this.personTableIdList = response.personTableIdList;
        } 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * PersonTableIdList.
         */
        public Builder personTableIdList(String personTableIdList) {
            this.putBodyParameter("PersonTableIdList", personTableIdList);
            this.personTableIdList = personTableIdList;
            return this;
        }

        @Override
        public DescribeAiotPersonTablesRequest build() {
            return new DescribeAiotPersonTablesRequest(this);
        } 

    } 

}
