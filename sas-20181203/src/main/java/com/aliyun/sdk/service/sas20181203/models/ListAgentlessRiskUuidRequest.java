// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAgentlessRiskUuidRequest} extends {@link RequestModel}
 *
 * <p>ListAgentlessRiskUuidRequest</p>
 */
public class ListAgentlessRiskUuidRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("InternetIp")
    private String internetIp;

    @Query
    @NameInMap("IntranetIp")
    private String intranetIp;

    @Query
    @NameInMap("MachineName")
    private String machineName;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Risk")
    private Boolean risk;

    @Query
    @NameInMap("TargetName")
    private String targetName;

    private ListAgentlessRiskUuidRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.internetIp = builder.internetIp;
        this.intranetIp = builder.intranetIp;
        this.machineName = builder.machineName;
        this.pageSize = builder.pageSize;
        this.risk = builder.risk;
        this.targetName = builder.targetName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentlessRiskUuidRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return internetIp
     */
    public String getInternetIp() {
        return this.internetIp;
    }

    /**
     * @return intranetIp
     */
    public String getIntranetIp() {
        return this.intranetIp;
    }

    /**
     * @return machineName
     */
    public String getMachineName() {
        return this.machineName;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return risk
     */
    public Boolean getRisk() {
        return this.risk;
    }

    /**
     * @return targetName
     */
    public String getTargetName() {
        return this.targetName;
    }

    public static final class Builder extends Request.Builder<ListAgentlessRiskUuidRequest, Builder> {
        private Integer currentPage; 
        private String internetIp; 
        private String intranetIp; 
        private String machineName; 
        private Integer pageSize; 
        private Boolean risk; 
        private String targetName; 

        private Builder() {
            super();
        } 

        private Builder(ListAgentlessRiskUuidRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.internetIp = request.internetIp;
            this.intranetIp = request.intranetIp;
            this.machineName = request.machineName;
            this.pageSize = request.pageSize;
            this.risk = request.risk;
            this.targetName = request.targetName;
        } 

        /**
         * The page number.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The public IP address of the asset that you want to query.
         */
        public Builder internetIp(String internetIp) {
            this.putQueryParameter("InternetIp", internetIp);
            this.internetIp = internetIp;
            return this;
        }

        /**
         * The private IP address of the asset that you want to query.
         */
        public Builder intranetIp(String intranetIp) {
            this.putQueryParameter("IntranetIp", intranetIp);
            this.intranetIp = intranetIp;
            return this;
        }

        /**
         * The name of the instance.
         */
        public Builder machineName(String machineName) {
            this.putQueryParameter("MachineName", machineName);
            this.machineName = machineName;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Specifies whether risks exist. Valid values:
         * <p>
         * 
         * *   **true**: Risks exist.
         * *   **false**: Risks do not exist.
         */
        public Builder risk(Boolean risk) {
            this.putQueryParameter("Risk", risk);
            this.risk = risk;
            return this;
        }

        /**
         * The name of the detection object.
         */
        public Builder targetName(String targetName) {
            this.putQueryParameter("TargetName", targetName);
            this.targetName = targetName;
            return this;
        }

        @Override
        public ListAgentlessRiskUuidRequest build() {
            return new ListAgentlessRiskUuidRequest(this);
        } 

    } 

}
