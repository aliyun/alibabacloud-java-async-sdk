// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ModifyAssetImportantRequest} extends {@link RequestModel}
 *
 * <p>ModifyAssetImportantRequest</p>
 */
public class ModifyAssetImportantRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImportantCode")
    private Integer importantCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UuidList")
    private String uuidList;

    private ModifyAssetImportantRequest(Builder builder) {
        super(builder);
        this.importantCode = builder.importantCode;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAssetImportantRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return importantCode
     */
    public Integer getImportantCode() {
        return this.importantCode;
    }

    /**
     * @return uuidList
     */
    public String getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<ModifyAssetImportantRequest, Builder> {
        private Integer importantCode; 
        private String uuidList; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAssetImportantRequest request) {
            super(request);
            this.importantCode = request.importantCode;
            this.uuidList = request.uuidList;
        } 

        /**
         * <p>The importance of the asset. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: test</li>
         * <li><strong>1</strong>: normal</li>
         * <li><strong>2</strong>: important</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder importantCode(Integer importantCode) {
            this.putQueryParameter("ImportantCode", importantCode);
            this.importantCode = importantCode;
            return this;
        }

        /**
         * <p>The UUIDs of servers. Separate multiple UUIDs with commas (,).</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>076a446d-df7d-424c-bdc5-bb5dc7f1****</p>
         */
        public Builder uuidList(String uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        @Override
        public ModifyAssetImportantRequest build() {
            return new ModifyAssetImportantRequest(this);
        } 

    } 

}
