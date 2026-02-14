// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ListDataCenterDatabaseRequest} extends {@link RequestModel}
 *
 * <p>ListDataCenterDatabaseRequest</p>
 */
public class ListDataCenterDatabaseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallFrom")
    private String callFrom;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DmsUnit")
    private String dmsUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImportType")
    private String importType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchKey")
    private String searchKey;

    private ListDataCenterDatabaseRequest(Builder builder) {
        super(builder);
        this.callFrom = builder.callFrom;
        this.dmsUnit = builder.dmsUnit;
        this.importType = builder.importType;
        this.language = builder.language;
        this.searchKey = builder.searchKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataCenterDatabaseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callFrom
     */
    public String getCallFrom() {
        return this.callFrom;
    }

    /**
     * @return dmsUnit
     */
    public String getDmsUnit() {
        return this.dmsUnit;
    }

    /**
     * @return importType
     */
    public String getImportType() {
        return this.importType;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return searchKey
     */
    public String getSearchKey() {
        return this.searchKey;
    }

    public static final class Builder extends Request.Builder<ListDataCenterDatabaseRequest, Builder> {
        private String callFrom; 
        private String dmsUnit; 
        private String importType; 
        private String language; 
        private String searchKey; 

        private Builder() {
            super();
        } 

        private Builder(ListDataCenterDatabaseRequest request) {
            super(request);
            this.callFrom = request.callFrom;
            this.dmsUnit = request.dmsUnit;
            this.importType = request.importType;
            this.language = request.language;
            this.searchKey = request.searchKey;
        } 

        /**
         * CallFrom.
         */
        public Builder callFrom(String callFrom) {
            this.putQueryParameter("CallFrom", callFrom);
            this.callFrom = callFrom;
            return this;
        }

        /**
         * DmsUnit.
         */
        public Builder dmsUnit(String dmsUnit) {
            this.putQueryParameter("DmsUnit", dmsUnit);
            this.dmsUnit = dmsUnit;
            return this;
        }

        /**
         * ImportType.
         */
        public Builder importType(String importType) {
            this.putQueryParameter("ImportType", importType);
            this.importType = importType;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * SearchKey.
         */
        public Builder searchKey(String searchKey) {
            this.putQueryParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        @Override
        public ListDataCenterDatabaseRequest build() {
            return new ListDataCenterDatabaseRequest(this);
        } 

    } 

}
