// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBizDataRangesRequest} extends {@link RequestModel}
 *
 * <p>QueryBizDataRangesRequest</p>
 */
public class QueryBizDataRangesRequest extends Request {
    @Query
    @NameInMap("DataType")
    private String dataType;

    @Query
    @NameInMap("ManageCode")
    private String manageCode;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("ParentBizDataRangeId")
    private Long parentBizDataRangeId;

    private QueryBizDataRangesRequest(Builder builder) {
        super(builder);
        this.dataType = builder.dataType;
        this.manageCode = builder.manageCode;
        this.name = builder.name;
        this.parentBizDataRangeId = builder.parentBizDataRangeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBizDataRangesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return manageCode
     */
    public String getManageCode() {
        return this.manageCode;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentBizDataRangeId
     */
    public Long getParentBizDataRangeId() {
        return this.parentBizDataRangeId;
    }

    public static final class Builder extends Request.Builder<QueryBizDataRangesRequest, Builder> {
        private String dataType; 
        private String manageCode; 
        private String name; 
        private Long parentBizDataRangeId; 

        private Builder() {
            super();
        } 

        private Builder(QueryBizDataRangesRequest response) {
            super(response);
            this.dataType = response.dataType;
            this.manageCode = response.manageCode;
            this.name = response.name;
            this.parentBizDataRangeId = response.parentBizDataRangeId;
        } 

        /**
         * DataType.
         */
        public Builder dataType(String dataType) {
            this.putQueryParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * ManageCode.
         */
        public Builder manageCode(String manageCode) {
            this.putQueryParameter("ManageCode", manageCode);
            this.manageCode = manageCode;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ParentBizDataRangeId.
         */
        public Builder parentBizDataRangeId(Long parentBizDataRangeId) {
            this.putQueryParameter("ParentBizDataRangeId", parentBizDataRangeId);
            this.parentBizDataRangeId = parentBizDataRangeId;
            return this;
        }

        @Override
        public QueryBizDataRangesRequest build() {
            return new QueryBizDataRangesRequest(this);
        } 

    } 

}
