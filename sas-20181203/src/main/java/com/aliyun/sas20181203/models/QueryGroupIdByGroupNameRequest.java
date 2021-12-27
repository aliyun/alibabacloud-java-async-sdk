// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link QueryGroupIdByGroupNameRequest} extends {@link RequestModel}
 *
 * <p>QueryGroupIdByGroupNameRequest</p>
 */
public class QueryGroupIdByGroupNameRequest extends Request {
    @Query
    @NameInMap("GroupName")
    private String groupName;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;


    private QueryGroupIdByGroupNameRequest(Builder builder) {
        super(builder);
        this.groupName = builder.groupName;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryGroupIdByGroupNameRequest create() {
        return builder().build();
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String groupName; 
        private String sourceIp; 

        /**
         * <p>GroupName.</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>SourceIp.</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        public QueryGroupIdByGroupNameRequest build() {
            return new QueryGroupIdByGroupNameRequest(this);
        } 

    } 

}
