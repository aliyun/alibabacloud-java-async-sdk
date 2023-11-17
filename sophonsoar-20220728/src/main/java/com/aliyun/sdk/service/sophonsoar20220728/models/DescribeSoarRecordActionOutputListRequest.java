// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSoarRecordActionOutputListRequest} extends {@link RequestModel}
 *
 * <p>DescribeSoarRecordActionOutputListRequest</p>
 */
public class DescribeSoarRecordActionOutputListRequest extends Request {
    @Query
    @NameInMap("ActionUuid")
    @Validation(required = true)
    private String actionUuid;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    private DescribeSoarRecordActionOutputListRequest(Builder builder) {
        super(builder);
        this.actionUuid = builder.actionUuid;
        this.lang = builder.lang;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSoarRecordActionOutputListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionUuid
     */
    public String getActionUuid() {
        return this.actionUuid;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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

    public static final class Builder extends Request.Builder<DescribeSoarRecordActionOutputListRequest, Builder> {
        private String actionUuid; 
        private String lang; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSoarRecordActionOutputListRequest request) {
            super(request);
            this.actionUuid = request.actionUuid;
            this.lang = request.lang;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * ActionUuid.
         */
        public Builder actionUuid(String actionUuid) {
            this.putQueryParameter("ActionUuid", actionUuid);
            this.actionUuid = actionUuid;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
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
        public DescribeSoarRecordActionOutputListRequest build() {
            return new DescribeSoarRecordActionOutputListRequest(this);
        } 

    } 

}
