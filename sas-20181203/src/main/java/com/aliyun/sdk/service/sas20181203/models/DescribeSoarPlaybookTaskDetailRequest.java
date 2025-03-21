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
 * {@link DescribeSoarPlaybookTaskDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeSoarPlaybookTaskDetailRequest</p>
 */
public class DescribeSoarPlaybookTaskDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlaybookId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long playbookId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long recordId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestUuid;

    private DescribeSoarPlaybookTaskDetailRequest(Builder builder) {
        super(builder);
        this.playbookId = builder.playbookId;
        this.recordId = builder.recordId;
        this.requestUuid = builder.requestUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSoarPlaybookTaskDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return playbookId
     */
    public Long getPlaybookId() {
        return this.playbookId;
    }

    /**
     * @return recordId
     */
    public Long getRecordId() {
        return this.recordId;
    }

    /**
     * @return requestUuid
     */
    public String getRequestUuid() {
        return this.requestUuid;
    }

    public static final class Builder extends Request.Builder<DescribeSoarPlaybookTaskDetailRequest, Builder> {
        private Long playbookId; 
        private Long recordId; 
        private String requestUuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSoarPlaybookTaskDetailRequest request) {
            super(request);
            this.playbookId = request.playbookId;
            this.recordId = request.recordId;
            this.requestUuid = request.requestUuid;
        } 

        /**
         * <p>Playbook ID.</p>
         * <blockquote>
         * <p>You can obtain this parameter by calling the <a href="https://help.aliyun.com/document_detail/2627461.html">DescribePlaybooks</a> interface.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder playbookId(Long playbookId) {
            this.putQueryParameter("PlaybookId", playbookId);
            this.playbookId = playbookId;
            return this;
        }

        /**
         * <p>The vulnerability ID passed when creating the policy task.</p>
         * <blockquote>
         * <p>You can obtain this parameter by calling the <a href="~~DescribeVulList~~">DescribeVulList</a> interface.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        public Builder recordId(Long recordId) {
            this.putQueryParameter("RecordId", recordId);
            this.recordId = recordId;
            return this;
        }

        /**
         * <p>UUID of the playbook task execution.</p>
         * <blockquote>
         * <p>You can obtain this parameter by calling the <a href="https://help.aliyun.com/document_detail/2627455.html">DescribeSoarRecords</a> interface.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a15e37da-abe0-4d87-acd2-024e875a****</p>
         */
        public Builder requestUuid(String requestUuid) {
            this.putQueryParameter("RequestUuid", requestUuid);
            this.requestUuid = requestUuid;
            return this;
        }

        @Override
        public DescribeSoarPlaybookTaskDetailRequest build() {
            return new DescribeSoarPlaybookTaskDetailRequest(this);
        } 

    } 

}
