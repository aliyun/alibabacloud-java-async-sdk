// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeAllTextResponseBody} extends {@link TeaModel}
 *
 * <p>RecognizeAllTextResponseBody</p>
 */
public class RecognizeAllTextResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private RecognizeAllTextResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeAllTextResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RecognizeAllTextResponseBody build() {
            return new RecognizeAllTextResponseBody(this);
        } 

    } 

    public static class BarCodePoints extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private BarCodePoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BarCodePoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public BarCodePoints build() {
                return new BarCodePoints(this);
            } 

        } 

    }
    public static class BarCodeRect extends TeaModel {
        @NameInMap("CenterX")
        private Integer centerX;

        @NameInMap("CenterY")
        private Integer centerY;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private BarCodeRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BarCodeRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public BarCodeRect build() {
                return new BarCodeRect(this);
            } 

        } 

    }
    public static class BarCodeDetails extends TeaModel {
        @NameInMap("BarCodeAngle")
        private Integer barCodeAngle;

        @NameInMap("BarCodePoints")
        private java.util.List < BarCodePoints> barCodePoints;

        @NameInMap("BarCodeRect")
        private BarCodeRect barCodeRect;

        @NameInMap("Data")
        private byte[] data;

        @NameInMap("Type")
        private String type;

        private BarCodeDetails(Builder builder) {
            this.barCodeAngle = builder.barCodeAngle;
            this.barCodePoints = builder.barCodePoints;
            this.barCodeRect = builder.barCodeRect;
            this.data = builder.data;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BarCodeDetails create() {
            return builder().build();
        }

        /**
         * @return barCodeAngle
         */
        public Integer getBarCodeAngle() {
            return this.barCodeAngle;
        }

        /**
         * @return barCodePoints
         */
        public java.util.List < BarCodePoints> getBarCodePoints() {
            return this.barCodePoints;
        }

        /**
         * @return barCodeRect
         */
        public BarCodeRect getBarCodeRect() {
            return this.barCodeRect;
        }

        /**
         * @return data
         */
        public byte[] getData() {
            return this.data;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer barCodeAngle; 
            private java.util.List < BarCodePoints> barCodePoints; 
            private BarCodeRect barCodeRect; 
            private byte[] data; 
            private String type; 

            /**
             * BarCodeAngle.
             */
            public Builder barCodeAngle(Integer barCodeAngle) {
                this.barCodeAngle = barCodeAngle;
                return this;
            }

            /**
             * BarCodePoints.
             */
            public Builder barCodePoints(java.util.List < BarCodePoints> barCodePoints) {
                this.barCodePoints = barCodePoints;
                return this;
            }

            /**
             * BarCodeRect.
             */
            public Builder barCodeRect(BarCodeRect barCodeRect) {
                this.barCodeRect = barCodeRect;
                return this;
            }

            /**
             * Data.
             */
            public Builder data(byte[] data) {
                this.data = data;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public BarCodeDetails build() {
                return new BarCodeDetails(this);
            } 

        } 

    }
    public static class BarCodeInfo extends TeaModel {
        @NameInMap("BarCodeCount")
        private Integer barCodeCount;

        @NameInMap("BarCodeDetails")
        private java.util.List < BarCodeDetails> barCodeDetails;

        private BarCodeInfo(Builder builder) {
            this.barCodeCount = builder.barCodeCount;
            this.barCodeDetails = builder.barCodeDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BarCodeInfo create() {
            return builder().build();
        }

        /**
         * @return barCodeCount
         */
        public Integer getBarCodeCount() {
            return this.barCodeCount;
        }

        /**
         * @return barCodeDetails
         */
        public java.util.List < BarCodeDetails> getBarCodeDetails() {
            return this.barCodeDetails;
        }

        public static final class Builder {
            private Integer barCodeCount; 
            private java.util.List < BarCodeDetails> barCodeDetails; 

            /**
             * BarCodeCount.
             */
            public Builder barCodeCount(Integer barCodeCount) {
                this.barCodeCount = barCodeCount;
                return this;
            }

            /**
             * BarCodeDetails.
             */
            public Builder barCodeDetails(java.util.List < BarCodeDetails> barCodeDetails) {
                this.barCodeDetails = barCodeDetails;
                return this;
            }

            public BarCodeInfo build() {
                return new BarCodeInfo(this);
            } 

        } 

    }
    public static class BlockPoints extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private BlockPoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockPoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public BlockPoints build() {
                return new BlockPoints(this);
            } 

        } 

    }
    public static class BlockRect extends TeaModel {
        @NameInMap("CenterX")
        private Integer centerX;

        @NameInMap("CenterY")
        private Integer centerY;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private BlockRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public BlockRect build() {
                return new BlockRect(this);
            } 

        } 

    }
    public static class CharPoints extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private CharPoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CharPoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public CharPoints build() {
                return new CharPoints(this);
            } 

        } 

    }
    public static class CharRect extends TeaModel {
        @NameInMap("CenterX")
        private Integer centerX;

        @NameInMap("CenterY")
        private Integer centerY;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private CharRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CharRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public CharRect build() {
                return new CharRect(this);
            } 

        } 

    }
    public static class CharInfos extends TeaModel {
        @NameInMap("CharConfidence")
        private Integer charConfidence;

        @NameInMap("CharContent")
        private String charContent;

        @NameInMap("CharId")
        private Integer charId;

        @NameInMap("CharPoints")
        private java.util.List < CharPoints> charPoints;

        @NameInMap("CharRect")
        private CharRect charRect;

        private CharInfos(Builder builder) {
            this.charConfidence = builder.charConfidence;
            this.charContent = builder.charContent;
            this.charId = builder.charId;
            this.charPoints = builder.charPoints;
            this.charRect = builder.charRect;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CharInfos create() {
            return builder().build();
        }

        /**
         * @return charConfidence
         */
        public Integer getCharConfidence() {
            return this.charConfidence;
        }

        /**
         * @return charContent
         */
        public String getCharContent() {
            return this.charContent;
        }

        /**
         * @return charId
         */
        public Integer getCharId() {
            return this.charId;
        }

        /**
         * @return charPoints
         */
        public java.util.List < CharPoints> getCharPoints() {
            return this.charPoints;
        }

        /**
         * @return charRect
         */
        public CharRect getCharRect() {
            return this.charRect;
        }

        public static final class Builder {
            private Integer charConfidence; 
            private String charContent; 
            private Integer charId; 
            private java.util.List < CharPoints> charPoints; 
            private CharRect charRect; 

            /**
             * CharConfidence.
             */
            public Builder charConfidence(Integer charConfidence) {
                this.charConfidence = charConfidence;
                return this;
            }

            /**
             * CharContent.
             */
            public Builder charContent(String charContent) {
                this.charContent = charContent;
                return this;
            }

            /**
             * CharId.
             */
            public Builder charId(Integer charId) {
                this.charId = charId;
                return this;
            }

            /**
             * CharPoints.
             */
            public Builder charPoints(java.util.List < CharPoints> charPoints) {
                this.charPoints = charPoints;
                return this;
            }

            /**
             * CharRect.
             */
            public Builder charRect(CharRect charRect) {
                this.charRect = charRect;
                return this;
            }

            public CharInfos build() {
                return new CharInfos(this);
            } 

        } 

    }
    public static class BlockDetails extends TeaModel {
        @NameInMap("BlockAngle")
        private Integer blockAngle;

        @NameInMap("BlockConfidence")
        private Integer blockConfidence;

        @NameInMap("BlockContent")
        private String blockContent;

        @NameInMap("BlockId")
        private Integer blockId;

        @NameInMap("BlockPoints")
        private java.util.List < BlockPoints> blockPoints;

        @NameInMap("BlockRect")
        private BlockRect blockRect;

        @NameInMap("CharInfos")
        private java.util.List < CharInfos> charInfos;

        private BlockDetails(Builder builder) {
            this.blockAngle = builder.blockAngle;
            this.blockConfidence = builder.blockConfidence;
            this.blockContent = builder.blockContent;
            this.blockId = builder.blockId;
            this.blockPoints = builder.blockPoints;
            this.blockRect = builder.blockRect;
            this.charInfos = builder.charInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockDetails create() {
            return builder().build();
        }

        /**
         * @return blockAngle
         */
        public Integer getBlockAngle() {
            return this.blockAngle;
        }

        /**
         * @return blockConfidence
         */
        public Integer getBlockConfidence() {
            return this.blockConfidence;
        }

        /**
         * @return blockContent
         */
        public String getBlockContent() {
            return this.blockContent;
        }

        /**
         * @return blockId
         */
        public Integer getBlockId() {
            return this.blockId;
        }

        /**
         * @return blockPoints
         */
        public java.util.List < BlockPoints> getBlockPoints() {
            return this.blockPoints;
        }

        /**
         * @return blockRect
         */
        public BlockRect getBlockRect() {
            return this.blockRect;
        }

        /**
         * @return charInfos
         */
        public java.util.List < CharInfos> getCharInfos() {
            return this.charInfos;
        }

        public static final class Builder {
            private Integer blockAngle; 
            private Integer blockConfidence; 
            private String blockContent; 
            private Integer blockId; 
            private java.util.List < BlockPoints> blockPoints; 
            private BlockRect blockRect; 
            private java.util.List < CharInfos> charInfos; 

            /**
             * BlockAngle.
             */
            public Builder blockAngle(Integer blockAngle) {
                this.blockAngle = blockAngle;
                return this;
            }

            /**
             * BlockConfidence.
             */
            public Builder blockConfidence(Integer blockConfidence) {
                this.blockConfidence = blockConfidence;
                return this;
            }

            /**
             * BlockContent.
             */
            public Builder blockContent(String blockContent) {
                this.blockContent = blockContent;
                return this;
            }

            /**
             * BlockId.
             */
            public Builder blockId(Integer blockId) {
                this.blockId = blockId;
                return this;
            }

            /**
             * BlockPoints.
             */
            public Builder blockPoints(java.util.List < BlockPoints> blockPoints) {
                this.blockPoints = blockPoints;
                return this;
            }

            /**
             * BlockRect.
             */
            public Builder blockRect(BlockRect blockRect) {
                this.blockRect = blockRect;
                return this;
            }

            /**
             * CharInfos.
             */
            public Builder charInfos(java.util.List < CharInfos> charInfos) {
                this.charInfos = charInfos;
                return this;
            }

            public BlockDetails build() {
                return new BlockDetails(this);
            } 

        } 

    }
    public static class BlockInfo extends TeaModel {
        @NameInMap("BlockCount")
        private Integer blockCount;

        @NameInMap("BlockDetails")
        private java.util.List < BlockDetails> blockDetails;

        private BlockInfo(Builder builder) {
            this.blockCount = builder.blockCount;
            this.blockDetails = builder.blockDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockInfo create() {
            return builder().build();
        }

        /**
         * @return blockCount
         */
        public Integer getBlockCount() {
            return this.blockCount;
        }

        /**
         * @return blockDetails
         */
        public java.util.List < BlockDetails> getBlockDetails() {
            return this.blockDetails;
        }

        public static final class Builder {
            private Integer blockCount; 
            private java.util.List < BlockDetails> blockDetails; 

            /**
             * BlockCount.
             */
            public Builder blockCount(Integer blockCount) {
                this.blockCount = blockCount;
                return this;
            }

            /**
             * BlockDetails.
             */
            public Builder blockDetails(java.util.List < BlockDetails> blockDetails) {
                this.blockDetails = blockDetails;
                return this;
            }

            public BlockInfo build() {
                return new BlockInfo(this);
            } 

        } 

    }
    public static class LayoutPoints extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private LayoutPoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LayoutPoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public LayoutPoints build() {
                return new LayoutPoints(this);
            } 

        } 

    }
    public static class LayoutRect extends TeaModel {
        @NameInMap("CenterX")
        private Integer centerX;

        @NameInMap("CenterY")
        private Integer centerY;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private LayoutRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LayoutRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public LayoutRect build() {
                return new LayoutRect(this);
            } 

        } 

    }
    public static class DocLayouts extends TeaModel {
        @NameInMap("LayoutPoints")
        private java.util.List < LayoutPoints> layoutPoints;

        @NameInMap("LayoutRect")
        private LayoutRect layoutRect;

        @NameInMap("LayoutType")
        private String layoutType;

        private DocLayouts(Builder builder) {
            this.layoutPoints = builder.layoutPoints;
            this.layoutRect = builder.layoutRect;
            this.layoutType = builder.layoutType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DocLayouts create() {
            return builder().build();
        }

        /**
         * @return layoutPoints
         */
        public java.util.List < LayoutPoints> getLayoutPoints() {
            return this.layoutPoints;
        }

        /**
         * @return layoutRect
         */
        public LayoutRect getLayoutRect() {
            return this.layoutRect;
        }

        /**
         * @return layoutType
         */
        public String getLayoutType() {
            return this.layoutType;
        }

        public static final class Builder {
            private java.util.List < LayoutPoints> layoutPoints; 
            private LayoutRect layoutRect; 
            private String layoutType; 

            /**
             * LayoutPoints.
             */
            public Builder layoutPoints(java.util.List < LayoutPoints> layoutPoints) {
                this.layoutPoints = layoutPoints;
                return this;
            }

            /**
             * LayoutRect.
             */
            public Builder layoutRect(LayoutRect layoutRect) {
                this.layoutRect = layoutRect;
                return this;
            }

            /**
             * LayoutType.
             */
            public Builder layoutType(String layoutType) {
                this.layoutType = layoutType;
                return this;
            }

            public DocLayouts build() {
                return new DocLayouts(this);
            } 

        } 

    }
    public static class SpecialTextPos extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private SpecialTextPos(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecialTextPos create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public SpecialTextPos build() {
                return new SpecialTextPos(this);
            } 

        } 

    }
    public static class SpecialTextRect extends TeaModel {
        @NameInMap("CenterX")
        private Integer centerX;

        @NameInMap("CenterY")
        private Integer centerY;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private SpecialTextRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecialTextRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public SpecialTextRect build() {
                return new SpecialTextRect(this);
            } 

        } 

    }
    public static class DocSpecialTexts extends TeaModel {
        @NameInMap("SpecialTextPos")
        private java.util.List < SpecialTextPos> specialTextPos;

        @NameInMap("SpecialTextRect")
        private SpecialTextRect specialTextRect;

        @NameInMap("SpecialTextType")
        private String specialTextType;

        private DocSpecialTexts(Builder builder) {
            this.specialTextPos = builder.specialTextPos;
            this.specialTextRect = builder.specialTextRect;
            this.specialTextType = builder.specialTextType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DocSpecialTexts create() {
            return builder().build();
        }

        /**
         * @return specialTextPos
         */
        public java.util.List < SpecialTextPos> getSpecialTextPos() {
            return this.specialTextPos;
        }

        /**
         * @return specialTextRect
         */
        public SpecialTextRect getSpecialTextRect() {
            return this.specialTextRect;
        }

        /**
         * @return specialTextType
         */
        public String getSpecialTextType() {
            return this.specialTextType;
        }

        public static final class Builder {
            private java.util.List < SpecialTextPos> specialTextPos; 
            private SpecialTextRect specialTextRect; 
            private String specialTextType; 

            /**
             * SpecialTextPos.
             */
            public Builder specialTextPos(java.util.List < SpecialTextPos> specialTextPos) {
                this.specialTextPos = specialTextPos;
                return this;
            }

            /**
             * SpecialTextRect.
             */
            public Builder specialTextRect(SpecialTextRect specialTextRect) {
                this.specialTextRect = specialTextRect;
                return this;
            }

            /**
             * SpecialTextType.
             */
            public Builder specialTextType(String specialTextType) {
                this.specialTextType = specialTextType;
                return this;
            }

            public DocSpecialTexts build() {
                return new DocSpecialTexts(this);
            } 

        } 

    }
    public static class SubFieldPos extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private SubFieldPos(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubFieldPos create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public SubFieldPos build() {
                return new SubFieldPos(this);
            } 

        } 

    }
    public static class SubFieldRect extends TeaModel {
        @NameInMap("CenterX")
        private Integer centerX;

        @NameInMap("CenterY")
        private Integer centerY;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private SubFieldRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubFieldRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public SubFieldRect build() {
                return new SubFieldRect(this);
            } 

        } 

    }
    public static class DocSubField extends TeaModel {
        @NameInMap("SubFieldPos")
        private java.util.List < SubFieldPos> subFieldPos;

        @NameInMap("SubFieldRect")
        private SubFieldRect subFieldRect;

        @NameInMap("SubFieldType")
        private String subFieldType;

        private DocSubField(Builder builder) {
            this.subFieldPos = builder.subFieldPos;
            this.subFieldRect = builder.subFieldRect;
            this.subFieldType = builder.subFieldType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DocSubField create() {
            return builder().build();
        }

        /**
         * @return subFieldPos
         */
        public java.util.List < SubFieldPos> getSubFieldPos() {
            return this.subFieldPos;
        }

        /**
         * @return subFieldRect
         */
        public SubFieldRect getSubFieldRect() {
            return this.subFieldRect;
        }

        /**
         * @return subFieldType
         */
        public String getSubFieldType() {
            return this.subFieldType;
        }

        public static final class Builder {
            private java.util.List < SubFieldPos> subFieldPos; 
            private SubFieldRect subFieldRect; 
            private String subFieldType; 

            /**
             * SubFieldPos.
             */
            public Builder subFieldPos(java.util.List < SubFieldPos> subFieldPos) {
                this.subFieldPos = subFieldPos;
                return this;
            }

            /**
             * SubFieldRect.
             */
            public Builder subFieldRect(SubFieldRect subFieldRect) {
                this.subFieldRect = subFieldRect;
                return this;
            }

            /**
             * SubFieldType.
             */
            public Builder subFieldType(String subFieldType) {
                this.subFieldType = subFieldType;
                return this;
            }

            public DocSubField build() {
                return new DocSubField(this);
            } 

        } 

    }
    public static class KvInfo extends TeaModel {
        @NameInMap("Data")
        private Object data;

        @NameInMap("KvCount")
        private Integer kvCount;

        @NameInMap("KvDetails")
        private java.util.Map < String, DataSubImagesKvInfoKvDetailsValue > kvDetails;

        private KvInfo(Builder builder) {
            this.data = builder.data;
            this.kvCount = builder.kvCount;
            this.kvDetails = builder.kvDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KvInfo create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Object getData() {
            return this.data;
        }

        /**
         * @return kvCount
         */
        public Integer getKvCount() {
            return this.kvCount;
        }

        /**
         * @return kvDetails
         */
        public java.util.Map < String, DataSubImagesKvInfoKvDetailsValue > getKvDetails() {
            return this.kvDetails;
        }

        public static final class Builder {
            private Object data; 
            private Integer kvCount; 
            private java.util.Map < String, DataSubImagesKvInfoKvDetailsValue > kvDetails; 

            /**
             * Data.
             */
            public Builder data(Object data) {
                this.data = data;
                return this;
            }

            /**
             * KvCount.
             */
            public Builder kvCount(Integer kvCount) {
                this.kvCount = kvCount;
                return this;
            }

            /**
             * KvDetails.
             */
            public Builder kvDetails(java.util.Map < String, DataSubImagesKvInfoKvDetailsValue > kvDetails) {
                this.kvDetails = kvDetails;
                return this;
            }

            public KvInfo build() {
                return new KvInfo(this);
            } 

        } 

    }
    public static class MathInfoPoints extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private MathInfoPoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MathInfoPoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public MathInfoPoints build() {
                return new MathInfoPoints(this);
            } 

        } 

    }
    public static class MathInfoRect extends TeaModel {
        @NameInMap("CenterX")
        private Integer centerX;

        @NameInMap("CenterY")
        private Integer centerY;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private MathInfoRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MathInfoRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public MathInfoRect build() {
                return new MathInfoRect(this);
            } 

        } 

    }
    public static class MathInfos extends TeaModel {
        @NameInMap("MathInfoPoints")
        private java.util.List < MathInfoPoints> mathInfoPoints;

        @NameInMap("MathInfoRect")
        private MathInfoRect mathInfoRect;

        @NameInMap("Result")
        private String result;

        @NameInMap("Title")
        private String title;

        private MathInfos(Builder builder) {
            this.mathInfoPoints = builder.mathInfoPoints;
            this.mathInfoRect = builder.mathInfoRect;
            this.result = builder.result;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MathInfos create() {
            return builder().build();
        }

        /**
         * @return mathInfoPoints
         */
        public java.util.List < MathInfoPoints> getMathInfoPoints() {
            return this.mathInfoPoints;
        }

        /**
         * @return mathInfoRect
         */
        public MathInfoRect getMathInfoRect() {
            return this.mathInfoRect;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private java.util.List < MathInfoPoints> mathInfoPoints; 
            private MathInfoRect mathInfoRect; 
            private String result; 
            private String title; 

            /**
             * MathInfoPoints.
             */
            public Builder mathInfoPoints(java.util.List < MathInfoPoints> mathInfoPoints) {
                this.mathInfoPoints = mathInfoPoints;
                return this;
            }

            /**
             * MathInfoRect.
             */
            public Builder mathInfoRect(MathInfoRect mathInfoRect) {
                this.mathInfoRect = mathInfoRect;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public MathInfos build() {
                return new MathInfos(this);
            } 

        } 

    }
    public static class Pages extends TeaModel {
        @NameInMap("ImageWidth")
        private Integer imageWidth;

        @NameInMap("InageHeight")
        private Integer inageHeight;

        @NameInMap("PageIdAllDocs")
        private Integer pageIdAllDocs;

        @NameInMap("PageIdCurDoc")
        private Integer pageIdCurDoc;

        private Pages(Builder builder) {
            this.imageWidth = builder.imageWidth;
            this.inageHeight = builder.inageHeight;
            this.pageIdAllDocs = builder.pageIdAllDocs;
            this.pageIdCurDoc = builder.pageIdCurDoc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pages create() {
            return builder().build();
        }

        /**
         * @return imageWidth
         */
        public Integer getImageWidth() {
            return this.imageWidth;
        }

        /**
         * @return inageHeight
         */
        public Integer getInageHeight() {
            return this.inageHeight;
        }

        /**
         * @return pageIdAllDocs
         */
        public Integer getPageIdAllDocs() {
            return this.pageIdAllDocs;
        }

        /**
         * @return pageIdCurDoc
         */
        public Integer getPageIdCurDoc() {
            return this.pageIdCurDoc;
        }

        public static final class Builder {
            private Integer imageWidth; 
            private Integer inageHeight; 
            private Integer pageIdAllDocs; 
            private Integer pageIdCurDoc; 

            /**
             * ImageWidth.
             */
            public Builder imageWidth(Integer imageWidth) {
                this.imageWidth = imageWidth;
                return this;
            }

            /**
             * InageHeight.
             */
            public Builder inageHeight(Integer inageHeight) {
                this.inageHeight = inageHeight;
                return this;
            }

            /**
             * PageIdAllDocs.
             */
            public Builder pageIdAllDocs(Integer pageIdAllDocs) {
                this.pageIdAllDocs = pageIdAllDocs;
                return this;
            }

            /**
             * PageIdCurDoc.
             */
            public Builder pageIdCurDoc(Integer pageIdCurDoc) {
                this.pageIdCurDoc = pageIdCurDoc;
                return this;
            }

            public Pages build() {
                return new Pages(this);
            } 

        } 

    }
    public static class DocInfo extends TeaModel {
        @NameInMap("Pages")
        private java.util.List < Pages> pages;

        private DocInfo(Builder builder) {
            this.pages = builder.pages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DocInfo create() {
            return builder().build();
        }

        /**
         * @return pages
         */
        public java.util.List < Pages> getPages() {
            return this.pages;
        }

        public static final class Builder {
            private java.util.List < Pages> pages; 

            /**
             * Pages.
             */
            public Builder pages(java.util.List < Pages> pages) {
                this.pages = pages;
                return this;
            }

            public DocInfo build() {
                return new DocInfo(this);
            } 

        } 

    }
    public static class LayoutInfosLayoutPoints extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private LayoutInfosLayoutPoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LayoutInfosLayoutPoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public LayoutInfosLayoutPoints build() {
                return new LayoutInfosLayoutPoints(this);
            } 

        } 

    }
    public static class LayoutInfosLayoutRect extends TeaModel {
        @NameInMap("CenterX")
        private Integer centerX;

        @NameInMap("CenterY")
        private Integer centerY;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private LayoutInfosLayoutRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LayoutInfosLayoutRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public LayoutInfosLayoutRect build() {
                return new LayoutInfosLayoutRect(this);
            } 

        } 

    }
    public static class LayoutInfos extends TeaModel {
        @NameInMap("Alignment")
        private String alignment;

        @NameInMap("Index")
        private Integer index;

        @NameInMap("LayoutPoints")
        private java.util.List < LayoutInfosLayoutPoints> layoutPoints;

        @NameInMap("LayoutRect")
        private LayoutInfosLayoutRect layoutRect;

        @NameInMap("PageNum")
        private java.util.List < Integer > pageNum;

        @NameInMap("Source")
        private String source;

        @NameInMap("SubType")
        private String subType;

        @NameInMap("Text")
        private String text;

        @NameInMap("Type")
        private String type;

        @NameInMap("UniqueID")
        private String uniqueID;

        private LayoutInfos(Builder builder) {
            this.alignment = builder.alignment;
            this.index = builder.index;
            this.layoutPoints = builder.layoutPoints;
            this.layoutRect = builder.layoutRect;
            this.pageNum = builder.pageNum;
            this.source = builder.source;
            this.subType = builder.subType;
            this.text = builder.text;
            this.type = builder.type;
            this.uniqueID = builder.uniqueID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LayoutInfos create() {
            return builder().build();
        }

        /**
         * @return alignment
         */
        public String getAlignment() {
            return this.alignment;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return layoutPoints
         */
        public java.util.List < LayoutInfosLayoutPoints> getLayoutPoints() {
            return this.layoutPoints;
        }

        /**
         * @return layoutRect
         */
        public LayoutInfosLayoutRect getLayoutRect() {
            return this.layoutRect;
        }

        /**
         * @return pageNum
         */
        public java.util.List < Integer > getPageNum() {
            return this.pageNum;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uniqueID
         */
        public String getUniqueID() {
            return this.uniqueID;
        }

        public static final class Builder {
            private String alignment; 
            private Integer index; 
            private java.util.List < LayoutInfosLayoutPoints> layoutPoints; 
            private LayoutInfosLayoutRect layoutRect; 
            private java.util.List < Integer > pageNum; 
            private String source; 
            private String subType; 
            private String text; 
            private String type; 
            private String uniqueID; 

            /**
             * Alignment.
             */
            public Builder alignment(String alignment) {
                this.alignment = alignment;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * LayoutPoints.
             */
            public Builder layoutPoints(java.util.List < LayoutInfosLayoutPoints> layoutPoints) {
                this.layoutPoints = layoutPoints;
                return this;
            }

            /**
             * LayoutRect.
             */
            public Builder layoutRect(LayoutInfosLayoutRect layoutRect) {
                this.layoutRect = layoutRect;
                return this;
            }

            /**
             * PageNum.
             */
            public Builder pageNum(java.util.List < Integer > pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * SubType.
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UniqueID.
             */
            public Builder uniqueID(String uniqueID) {
                this.uniqueID = uniqueID;
                return this;
            }

            public LayoutInfos build() {
                return new LayoutInfos(this);
            } 

        } 

    }
    public static class Styles extends TeaModel {
        @NameInMap("Bold")
        private Boolean bold;

        @NameInMap("CharScale")
        private Float charScale;

        @NameInMap("Color")
        private String color;

        @NameInMap("DeleteLine")
        private Boolean deleteLine;

        @NameInMap("FontName")
        private String fontName;

        @NameInMap("FontSize")
        private Integer fontSize;

        @NameInMap("Italic")
        private Boolean italic;

        @NameInMap("StyleId")
        private Integer styleId;

        @NameInMap("Underline")
        private Boolean underline;

        private Styles(Builder builder) {
            this.bold = builder.bold;
            this.charScale = builder.charScale;
            this.color = builder.color;
            this.deleteLine = builder.deleteLine;
            this.fontName = builder.fontName;
            this.fontSize = builder.fontSize;
            this.italic = builder.italic;
            this.styleId = builder.styleId;
            this.underline = builder.underline;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Styles create() {
            return builder().build();
        }

        /**
         * @return bold
         */
        public Boolean getBold() {
            return this.bold;
        }

        /**
         * @return charScale
         */
        public Float getCharScale() {
            return this.charScale;
        }

        /**
         * @return color
         */
        public String getColor() {
            return this.color;
        }

        /**
         * @return deleteLine
         */
        public Boolean getDeleteLine() {
            return this.deleteLine;
        }

        /**
         * @return fontName
         */
        public String getFontName() {
            return this.fontName;
        }

        /**
         * @return fontSize
         */
        public Integer getFontSize() {
            return this.fontSize;
        }

        /**
         * @return italic
         */
        public Boolean getItalic() {
            return this.italic;
        }

        /**
         * @return styleId
         */
        public Integer getStyleId() {
            return this.styleId;
        }

        /**
         * @return underline
         */
        public Boolean getUnderline() {
            return this.underline;
        }

        public static final class Builder {
            private Boolean bold; 
            private Float charScale; 
            private String color; 
            private Boolean deleteLine; 
            private String fontName; 
            private Integer fontSize; 
            private Boolean italic; 
            private Integer styleId; 
            private Boolean underline; 

            /**
             * Bold.
             */
            public Builder bold(Boolean bold) {
                this.bold = bold;
                return this;
            }

            /**
             * CharScale.
             */
            public Builder charScale(Float charScale) {
                this.charScale = charScale;
                return this;
            }

            /**
             * Color.
             */
            public Builder color(String color) {
                this.color = color;
                return this;
            }

            /**
             * DeleteLine.
             */
            public Builder deleteLine(Boolean deleteLine) {
                this.deleteLine = deleteLine;
                return this;
            }

            /**
             * FontName.
             */
            public Builder fontName(String fontName) {
                this.fontName = fontName;
                return this;
            }

            /**
             * FontSize.
             */
            public Builder fontSize(Integer fontSize) {
                this.fontSize = fontSize;
                return this;
            }

            /**
             * Italic.
             */
            public Builder italic(Boolean italic) {
                this.italic = italic;
                return this;
            }

            /**
             * StyleId.
             */
            public Builder styleId(Integer styleId) {
                this.styleId = styleId;
                return this;
            }

            /**
             * Underline.
             */
            public Builder underline(Boolean underline) {
                this.underline = underline;
                return this;
            }

            public Styles build() {
                return new Styles(this);
            } 

        } 

    }
    public static class NewStyleData extends TeaModel {
        @NameInMap("DocInfo")
        private DocInfo docInfo;

        @NameInMap("LayoutInfos")
        private java.util.List < LayoutInfos> layoutInfos;

        @NameInMap("Styles")
        private java.util.List < Styles> styles;

        private NewStyleData(Builder builder) {
            this.docInfo = builder.docInfo;
            this.layoutInfos = builder.layoutInfos;
            this.styles = builder.styles;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NewStyleData create() {
            return builder().build();
        }

        /**
         * @return docInfo
         */
        public DocInfo getDocInfo() {
            return this.docInfo;
        }

        /**
         * @return layoutInfos
         */
        public java.util.List < LayoutInfos> getLayoutInfos() {
            return this.layoutInfos;
        }

        /**
         * @return styles
         */
        public java.util.List < Styles> getStyles() {
            return this.styles;
        }

        public static final class Builder {
            private DocInfo docInfo; 
            private java.util.List < LayoutInfos> layoutInfos; 
            private java.util.List < Styles> styles; 

            /**
             * DocInfo.
             */
            public Builder docInfo(DocInfo docInfo) {
                this.docInfo = docInfo;
                return this;
            }

            /**
             * LayoutInfos.
             */
            public Builder layoutInfos(java.util.List < LayoutInfos> layoutInfos) {
                this.layoutInfos = layoutInfos;
                return this;
            }

            /**
             * Styles.
             */
            public Builder styles(java.util.List < Styles> styles) {
                this.styles = styles;
                return this;
            }

            public NewStyleData build() {
                return new NewStyleData(this);
            } 

        } 

    }
    public static class BlockDetailsBlockPoints extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private BlockDetailsBlockPoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockDetailsBlockPoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public BlockDetailsBlockPoints build() {
                return new BlockDetailsBlockPoints(this);
            } 

        } 

    }
    public static class BlockDetailsBlockRect extends TeaModel {
        @NameInMap("CenterX")
        private Integer centerX;

        @NameInMap("CenterY")
        private Integer centerY;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private BlockDetailsBlockRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockDetailsBlockRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public BlockDetailsBlockRect build() {
                return new BlockDetailsBlockRect(this);
            } 

        } 

    }
    public static class CharInfoCharPoints extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private CharInfoCharPoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CharInfoCharPoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public CharInfoCharPoints build() {
                return new CharInfoCharPoints(this);
            } 

        } 

    }
    public static class CharInfoCharRect extends TeaModel {
        @NameInMap("CenterX")
        private Integer centerX;

        @NameInMap("CenterY")
        private Integer centerY;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private CharInfoCharRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CharInfoCharRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public CharInfoCharRect build() {
                return new CharInfoCharRect(this);
            } 

        } 

    }
    public static class CharInfo extends TeaModel {
        @NameInMap("CharId")
        private Integer charId;

        @NameInMap("CharPoints")
        private java.util.List < CharInfoCharPoints> charPoints;

        @NameInMap("CharRect")
        private CharInfoCharRect charRect;

        @NameInMap("Confidence")
        private Integer confidence;

        @NameInMap("Content")
        private String content;

        private CharInfo(Builder builder) {
            this.charId = builder.charId;
            this.charPoints = builder.charPoints;
            this.charRect = builder.charRect;
            this.confidence = builder.confidence;
            this.content = builder.content;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CharInfo create() {
            return builder().build();
        }

        /**
         * @return charId
         */
        public Integer getCharId() {
            return this.charId;
        }

        /**
         * @return charPoints
         */
        public java.util.List < CharInfoCharPoints> getCharPoints() {
            return this.charPoints;
        }

        /**
         * @return charRect
         */
        public CharInfoCharRect getCharRect() {
            return this.charRect;
        }

        /**
         * @return confidence
         */
        public Integer getConfidence() {
            return this.confidence;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        public static final class Builder {
            private Integer charId; 
            private java.util.List < CharInfoCharPoints> charPoints; 
            private CharInfoCharRect charRect; 
            private Integer confidence; 
            private String content; 

            /**
             * CharId.
             */
            public Builder charId(Integer charId) {
                this.charId = charId;
                return this;
            }

            /**
             * CharPoints.
             */
            public Builder charPoints(java.util.List < CharInfoCharPoints> charPoints) {
                this.charPoints = charPoints;
                return this;
            }

            /**
             * CharRect.
             */
            public Builder charRect(CharInfoCharRect charRect) {
                this.charRect = charRect;
                return this;
            }

            /**
             * Confidence.
             */
            public Builder confidence(Integer confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            public CharInfo build() {
                return new CharInfo(this);
            } 

        } 

    }
    public static class BlockInfoBlockDetails extends TeaModel {
        @NameInMap("Angle")
        private Integer angle;

        @NameInMap("BlockId")
        private Integer blockId;

        @NameInMap("BlockPoints")
        private java.util.List < BlockDetailsBlockPoints> blockPoints;

        @NameInMap("BlockRect")
        private BlockDetailsBlockRect blockRect;

        @NameInMap("CharInfo")
        private java.util.List < CharInfo> charInfo;

        @NameInMap("Confidence")
        private Integer confidence;

        @NameInMap("Content")
        private String content;

        private BlockInfoBlockDetails(Builder builder) {
            this.angle = builder.angle;
            this.blockId = builder.blockId;
            this.blockPoints = builder.blockPoints;
            this.blockRect = builder.blockRect;
            this.charInfo = builder.charInfo;
            this.confidence = builder.confidence;
            this.content = builder.content;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockInfoBlockDetails create() {
            return builder().build();
        }

        /**
         * @return angle
         */
        public Integer getAngle() {
            return this.angle;
        }

        /**
         * @return blockId
         */
        public Integer getBlockId() {
            return this.blockId;
        }

        /**
         * @return blockPoints
         */
        public java.util.List < BlockDetailsBlockPoints> getBlockPoints() {
            return this.blockPoints;
        }

        /**
         * @return blockRect
         */
        public BlockDetailsBlockRect getBlockRect() {
            return this.blockRect;
        }

        /**
         * @return charInfo
         */
        public java.util.List < CharInfo> getCharInfo() {
            return this.charInfo;
        }

        /**
         * @return confidence
         */
        public Integer getConfidence() {
            return this.confidence;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        public static final class Builder {
            private Integer angle; 
            private Integer blockId; 
            private java.util.List < BlockDetailsBlockPoints> blockPoints; 
            private BlockDetailsBlockRect blockRect; 
            private java.util.List < CharInfo> charInfo; 
            private Integer confidence; 
            private String content; 

            /**
             * Angle.
             */
            public Builder angle(Integer angle) {
                this.angle = angle;
                return this;
            }

            /**
             * BlockId.
             */
            public Builder blockId(Integer blockId) {
                this.blockId = blockId;
                return this;
            }

            /**
             * BlockPoints.
             */
            public Builder blockPoints(java.util.List < BlockDetailsBlockPoints> blockPoints) {
                this.blockPoints = blockPoints;
                return this;
            }

            /**
             * BlockRect.
             */
            public Builder blockRect(BlockDetailsBlockRect blockRect) {
                this.blockRect = blockRect;
                return this;
            }

            /**
             * CharInfo.
             */
            public Builder charInfo(java.util.List < CharInfo> charInfo) {
                this.charInfo = charInfo;
                return this;
            }

            /**
             * Confidence.
             */
            public Builder confidence(Integer confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            public BlockInfoBlockDetails build() {
                return new BlockInfoBlockDetails(this);
            } 

        } 

    }
    public static class SubjectInfosBlockInfo extends TeaModel {
        @NameInMap("BlockCount")
        private Integer blockCount;

        @NameInMap("BlockDetails")
        private java.util.List < BlockInfoBlockDetails> blockDetails;

        private SubjectInfosBlockInfo(Builder builder) {
            this.blockCount = builder.blockCount;
            this.blockDetails = builder.blockDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubjectInfosBlockInfo create() {
            return builder().build();
        }

        /**
         * @return blockCount
         */
        public Integer getBlockCount() {
            return this.blockCount;
        }

        /**
         * @return blockDetails
         */
        public java.util.List < BlockInfoBlockDetails> getBlockDetails() {
            return this.blockDetails;
        }

        public static final class Builder {
            private Integer blockCount; 
            private java.util.List < BlockInfoBlockDetails> blockDetails; 

            /**
             * BlockCount.
             */
            public Builder blockCount(Integer blockCount) {
                this.blockCount = blockCount;
                return this;
            }

            /**
             * BlockDetails.
             */
            public Builder blockDetails(java.util.List < BlockInfoBlockDetails> blockDetails) {
                this.blockDetails = blockDetails;
                return this;
            }

            public SubjectInfosBlockInfo build() {
                return new SubjectInfosBlockInfo(this);
            } 

        } 

    }
    public static class ContentPoints extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private ContentPoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContentPoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public ContentPoints build() {
                return new ContentPoints(this);
            } 

        } 

    }
    public static class ContentRect extends TeaModel {
        @NameInMap("CenterX")
        private Integer centerX;

        @NameInMap("CenterY")
        private Integer centerY;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private ContentRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContentRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public ContentRect build() {
                return new ContentRect(this);
            } 

        } 

    }
    public static class ContentInfos extends TeaModel {
        @NameInMap("ContentPoints")
        private java.util.List < ContentPoints> contentPoints;

        @NameInMap("ContentRect")
        private ContentRect contentRect;

        @NameInMap("DocIndex")
        private Integer docIndex;

        private ContentInfos(Builder builder) {
            this.contentPoints = builder.contentPoints;
            this.contentRect = builder.contentRect;
            this.docIndex = builder.docIndex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContentInfos create() {
            return builder().build();
        }

        /**
         * @return contentPoints
         */
        public java.util.List < ContentPoints> getContentPoints() {
            return this.contentPoints;
        }

        /**
         * @return contentRect
         */
        public ContentRect getContentRect() {
            return this.contentRect;
        }

        /**
         * @return docIndex
         */
        public Integer getDocIndex() {
            return this.docIndex;
        }

        public static final class Builder {
            private java.util.List < ContentPoints> contentPoints; 
            private ContentRect contentRect; 
            private Integer docIndex; 

            /**
             * ContentPoints.
             */
            public Builder contentPoints(java.util.List < ContentPoints> contentPoints) {
                this.contentPoints = contentPoints;
                return this;
            }

            /**
             * ContentRect.
             */
            public Builder contentRect(ContentRect contentRect) {
                this.contentRect = contentRect;
                return this;
            }

            /**
             * DocIndex.
             */
            public Builder docIndex(Integer docIndex) {
                this.docIndex = docIndex;
                return this;
            }

            public ContentInfos build() {
                return new ContentInfos(this);
            } 

        } 

    }
    public static class SubjectInfos extends TeaModel {
        @NameInMap("BlockInfo")
        private SubjectInfosBlockInfo blockInfo;

        @NameInMap("Content")
        private String content;

        @NameInMap("ContentInfos")
        private java.util.List < ContentInfos> contentInfos;

        @NameInMap("Ids")
        private java.util.List < Integer > ids;

        @NameInMap("IsMultiPage")
        private Boolean isMultiPage;

        private SubjectInfos(Builder builder) {
            this.blockInfo = builder.blockInfo;
            this.content = builder.content;
            this.contentInfos = builder.contentInfos;
            this.ids = builder.ids;
            this.isMultiPage = builder.isMultiPage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubjectInfos create() {
            return builder().build();
        }

        /**
         * @return blockInfo
         */
        public SubjectInfosBlockInfo getBlockInfo() {
            return this.blockInfo;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentInfos
         */
        public java.util.List < ContentInfos> getContentInfos() {
            return this.contentInfos;
        }

        /**
         * @return ids
         */
        public java.util.List < Integer > getIds() {
            return this.ids;
        }

        /**
         * @return isMultiPage
         */
        public Boolean getIsMultiPage() {
            return this.isMultiPage;
        }

        public static final class Builder {
            private SubjectInfosBlockInfo blockInfo; 
            private String content; 
            private java.util.List < ContentInfos> contentInfos; 
            private java.util.List < Integer > ids; 
            private Boolean isMultiPage; 

            /**
             * BlockInfo.
             */
            public Builder blockInfo(SubjectInfosBlockInfo blockInfo) {
                this.blockInfo = blockInfo;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * ContentInfos.
             */
            public Builder contentInfos(java.util.List < ContentInfos> contentInfos) {
                this.contentInfos = contentInfos;
                return this;
            }

            /**
             * Ids.
             */
            public Builder ids(java.util.List < Integer > ids) {
                this.ids = ids;
                return this;
            }

            /**
             * IsMultiPage.
             */
            public Builder isMultiPage(Boolean isMultiPage) {
                this.isMultiPage = isMultiPage;
                return this;
            }

            public SubjectInfos build() {
                return new SubjectInfos(this);
            } 

        } 

    }
    public static class PageInfos extends TeaModel {
        @NameInMap("Angle")
        private Integer angle;

        @NameInMap("DocIndex")
        private Integer docIndex;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("PageId")
        private Integer pageId;

        @NameInMap("SubjectInfos")
        private java.util.List < SubjectInfos> subjectInfos;

        @NameInMap("Width")
        private Integer width;

        private PageInfos(Builder builder) {
            this.angle = builder.angle;
            this.docIndex = builder.docIndex;
            this.height = builder.height;
            this.pageId = builder.pageId;
            this.subjectInfos = builder.subjectInfos;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfos create() {
            return builder().build();
        }

        /**
         * @return angle
         */
        public Integer getAngle() {
            return this.angle;
        }

        /**
         * @return docIndex
         */
        public Integer getDocIndex() {
            return this.docIndex;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return pageId
         */
        public Integer getPageId() {
            return this.pageId;
        }

        /**
         * @return subjectInfos
         */
        public java.util.List < SubjectInfos> getSubjectInfos() {
            return this.subjectInfos;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer angle; 
            private Integer docIndex; 
            private Integer height; 
            private Integer pageId; 
            private java.util.List < SubjectInfos> subjectInfos; 
            private Integer width; 

            /**
             * Angle.
             */
            public Builder angle(Integer angle) {
                this.angle = angle;
                return this;
            }

            /**
             * DocIndex.
             */
            public Builder docIndex(Integer docIndex) {
                this.docIndex = docIndex;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * PageId.
             */
            public Builder pageId(Integer pageId) {
                this.pageId = pageId;
                return this;
            }

            /**
             * SubjectInfos.
             */
            public Builder subjectInfos(java.util.List < SubjectInfos> subjectInfos) {
                this.subjectInfos = subjectInfos;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public PageInfos build() {
                return new PageInfos(this);
            } 

        } 

    }
    public static class ParagraphDetails extends TeaModel {
        @NameInMap("BlockList")
        private java.util.List < Integer > blockList;

        @NameInMap("ParagraphContent")
        private String paragraphContent;

        @NameInMap("ParagraphId")
        private Integer paragraphId;

        private ParagraphDetails(Builder builder) {
            this.blockList = builder.blockList;
            this.paragraphContent = builder.paragraphContent;
            this.paragraphId = builder.paragraphId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParagraphDetails create() {
            return builder().build();
        }

        /**
         * @return blockList
         */
        public java.util.List < Integer > getBlockList() {
            return this.blockList;
        }

        /**
         * @return paragraphContent
         */
        public String getParagraphContent() {
            return this.paragraphContent;
        }

        /**
         * @return paragraphId
         */
        public Integer getParagraphId() {
            return this.paragraphId;
        }

        public static final class Builder {
            private java.util.List < Integer > blockList; 
            private String paragraphContent; 
            private Integer paragraphId; 

            /**
             * BlockList.
             */
            public Builder blockList(java.util.List < Integer > blockList) {
                this.blockList = blockList;
                return this;
            }

            /**
             * ParagraphContent.
             */
            public Builder paragraphContent(String paragraphContent) {
                this.paragraphContent = paragraphContent;
                return this;
            }

            /**
             * ParagraphId.
             */
            public Builder paragraphId(Integer paragraphId) {
                this.paragraphId = paragraphId;
                return this;
            }

            public ParagraphDetails build() {
                return new ParagraphDetails(this);
            } 

        } 

    }
    public static class ParagraphInfo extends TeaModel {
        @NameInMap("ParagraphCount")
        private Integer paragraphCount;

        @NameInMap("ParagraphDetails")
        private java.util.List < ParagraphDetails> paragraphDetails;

        private ParagraphInfo(Builder builder) {
            this.paragraphCount = builder.paragraphCount;
            this.paragraphDetails = builder.paragraphDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParagraphInfo create() {
            return builder().build();
        }

        /**
         * @return paragraphCount
         */
        public Integer getParagraphCount() {
            return this.paragraphCount;
        }

        /**
         * @return paragraphDetails
         */
        public java.util.List < ParagraphDetails> getParagraphDetails() {
            return this.paragraphDetails;
        }

        public static final class Builder {
            private Integer paragraphCount; 
            private java.util.List < ParagraphDetails> paragraphDetails; 

            /**
             * ParagraphCount.
             */
            public Builder paragraphCount(Integer paragraphCount) {
                this.paragraphCount = paragraphCount;
                return this;
            }

            /**
             * ParagraphDetails.
             */
            public Builder paragraphDetails(java.util.List < ParagraphDetails> paragraphDetails) {
                this.paragraphDetails = paragraphDetails;
                return this;
            }

            public ParagraphInfo build() {
                return new ParagraphInfo(this);
            } 

        } 

    }
    public static class PartInfoPointsList extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private PartInfoPointsList(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PartInfoPointsList create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public PartInfoPointsList build() {
                return new PartInfoPointsList(this);
            } 

        } 

    }
    public static class PartInfoRectList extends TeaModel {
        @NameInMap("CenterX")
        private Integer centerX;

        @NameInMap("CenterY")
        private Integer centerY;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private PartInfoRectList(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PartInfoRectList create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public PartInfoRectList build() {
                return new PartInfoRectList(this);
            } 

        } 

    }
    public static class AnswerPointsList extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private AnswerPointsList(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnswerPointsList create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public AnswerPointsList build() {
                return new AnswerPointsList(this);
            } 

        } 

    }
    public static class AnswerRectList extends TeaModel {
        @NameInMap("CenterX")
        private Integer centerX;

        @NameInMap("CenterY")
        private Integer centerY;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private AnswerRectList(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnswerRectList create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public AnswerRectList build() {
                return new AnswerRectList(this);
            } 

        } 

    }
    public static class ContentsContentPoints extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private ContentsContentPoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContentsContentPoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public ContentsContentPoints build() {
                return new ContentsContentPoints(this);
            } 

        } 

    }
    public static class ContentsContentRect extends TeaModel {
        @NameInMap("CenterX")
        private Integer centerX;

        @NameInMap("CenterY")
        private Integer centerY;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private ContentsContentRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContentsContentRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public ContentsContentRect build() {
                return new ContentsContentRect(this);
            } 

        } 

    }
    public static class Contents extends TeaModel {
        @NameInMap("Confidence")
        private Integer confidence;

        @NameInMap("ContentPoints")
        private java.util.List < ContentsContentPoints> contentPoints;

        @NameInMap("ContentRect")
        private ContentsContentRect contentRect;

        @NameInMap("ContentType")
        private Integer contentType;

        @NameInMap("Option")
        private String option;

        @NameInMap("Text")
        private String text;

        private Contents(Builder builder) {
            this.confidence = builder.confidence;
            this.contentPoints = builder.contentPoints;
            this.contentRect = builder.contentRect;
            this.contentType = builder.contentType;
            this.option = builder.option;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contents create() {
            return builder().build();
        }

        /**
         * @return confidence
         */
        public Integer getConfidence() {
            return this.confidence;
        }

        /**
         * @return contentPoints
         */
        public java.util.List < ContentsContentPoints> getContentPoints() {
            return this.contentPoints;
        }

        /**
         * @return contentRect
         */
        public ContentsContentRect getContentRect() {
            return this.contentRect;
        }

        /**
         * @return contentType
         */
        public Integer getContentType() {
            return this.contentType;
        }

        /**
         * @return option
         */
        public String getOption() {
            return this.option;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private Integer confidence; 
            private java.util.List < ContentsContentPoints> contentPoints; 
            private ContentsContentRect contentRect; 
            private Integer contentType; 
            private String option; 
            private String text; 

            /**
             * Confidence.
             */
            public Builder confidence(Integer confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * ContentPoints.
             */
            public Builder contentPoints(java.util.List < ContentsContentPoints> contentPoints) {
                this.contentPoints = contentPoints;
                return this;
            }

            /**
             * ContentRect.
             */
            public Builder contentRect(ContentsContentRect contentRect) {
                this.contentRect = contentRect;
                return this;
            }

            /**
             * ContentType.
             */
            public Builder contentType(Integer contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * Option.
             */
            public Builder option(String option) {
                this.option = option;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Contents build() {
                return new Contents(this);
            } 

        } 

    }
    public static class ElementPointsList extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private ElementPointsList(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ElementPointsList create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public ElementPointsList build() {
                return new ElementPointsList(this);
            } 

        } 

    }
    public static class ElementRectList extends TeaModel {
        @NameInMap("CenterX")
        private Integer centerX;

        @NameInMap("CenterY")
        private Integer centerY;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private ElementRectList(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ElementRectList create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public ElementRectList build() {
                return new ElementRectList(this);
            } 

        } 

    }
    public static class Elements extends TeaModel {
        @NameInMap("Contents")
        private java.util.List < Contents> contents;

        @NameInMap("ElementPointsList")
        private java.util.List < java.util.List < ElementPointsList> > elementPointsList;

        @NameInMap("ElementRectList")
        private java.util.List < ElementRectList> elementRectList;

        @NameInMap("ElementType")
        private Integer elementType;

        @NameInMap("Text")
        private String text;

        private Elements(Builder builder) {
            this.contents = builder.contents;
            this.elementPointsList = builder.elementPointsList;
            this.elementRectList = builder.elementRectList;
            this.elementType = builder.elementType;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Elements create() {
            return builder().build();
        }

        /**
         * @return contents
         */
        public java.util.List < Contents> getContents() {
            return this.contents;
        }

        /**
         * @return elementPointsList
         */
        public java.util.List < java.util.List < ElementPointsList> > getElementPointsList() {
            return this.elementPointsList;
        }

        /**
         * @return elementRectList
         */
        public java.util.List < ElementRectList> getElementRectList() {
            return this.elementRectList;
        }

        /**
         * @return elementType
         */
        public Integer getElementType() {
            return this.elementType;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private java.util.List < Contents> contents; 
            private java.util.List < java.util.List < ElementPointsList> > elementPointsList; 
            private java.util.List < ElementRectList> elementRectList; 
            private Integer elementType; 
            private String text; 

            /**
             * Contents.
             */
            public Builder contents(java.util.List < Contents> contents) {
                this.contents = contents;
                return this;
            }

            /**
             * ElementPointsList.
             */
            public Builder elementPointsList(java.util.List < java.util.List < ElementPointsList> > elementPointsList) {
                this.elementPointsList = elementPointsList;
                return this;
            }

            /**
             * ElementRectList.
             */
            public Builder elementRectList(java.util.List < ElementRectList> elementRectList) {
                this.elementRectList = elementRectList;
                return this;
            }

            /**
             * ElementType.
             */
            public Builder elementType(Integer elementType) {
                this.elementType = elementType;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Elements build() {
                return new Elements(this);
            } 

        } 

    }
    public static class FigurePointsList extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private FigurePointsList(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FigurePointsList create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public FigurePointsList build() {
                return new FigurePointsList(this);
            } 

        } 

    }
    public static class FigureRectList extends TeaModel {
        @NameInMap("CenterX")
        private Integer centerX;

        @NameInMap("CenterY")
        private Integer centerY;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private FigureRectList(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FigureRectList create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public FigureRectList build() {
                return new FigureRectList(this);
            } 

        } 

    }
    public static class SubjectPointsList extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private SubjectPointsList(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubjectPointsList create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public SubjectPointsList build() {
                return new SubjectPointsList(this);
            } 

        } 

    }
    public static class SubjectRectList extends TeaModel {
        @NameInMap("CenterX")
        private String centerX;

        @NameInMap("CenterY")
        private String centerY;

        @NameInMap("Height")
        private String height;

        @NameInMap("Width")
        private String width;

        private SubjectRectList(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubjectRectList create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public String getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public String getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String centerX; 
            private String centerY; 
            private String height; 
            private String width; 

            /**
             * CenterX.
             */
            public Builder centerX(String centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(String centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public SubjectRectList build() {
                return new SubjectRectList(this);
            } 

        } 

    }
    public static class TablePointsList extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private TablePointsList(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TablePointsList create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public TablePointsList build() {
                return new TablePointsList(this);
            } 

        } 

    }
    public static class TableRectList extends TeaModel {
        @NameInMap("CenterX")
        private Integer centerX;

        @NameInMap("CenterY")
        private Integer centerY;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private TableRectList(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableRectList create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public TableRectList build() {
                return new TableRectList(this);
            } 

        } 

    }
    public static class SubjectList extends TeaModel {
        @NameInMap("AnswerPointsList")
        private java.util.List < java.util.List < AnswerPointsList> > answerPointsList;

        @NameInMap("AnswerRectList")
        private java.util.List < AnswerRectList> answerRectList;

        @NameInMap("Confidence")
        private Integer confidence;

        @NameInMap("Elements")
        private java.util.List < Elements> elements;

        @NameInMap("FigurePointsList")
        private java.util.List < java.util.List < FigurePointsList> > figurePointsList;

        @NameInMap("FigureRectList")
        private java.util.List < FigureRectList> figureRectList;

        @NameInMap("Index")
        private Integer index;

        @NameInMap("NumChoices")
        private Integer numChoices;

        @NameInMap("SubjectPointsList")
        private java.util.List < java.util.List < SubjectPointsList> > subjectPointsList;

        @NameInMap("SubjectRectList")
        private java.util.List < SubjectRectList> subjectRectList;

        @NameInMap("SubjectType")
        private Integer subjectType;

        @NameInMap("TablePointsList")
        private java.util.List < java.util.List < TablePointsList> > tablePointsList;

        @NameInMap("TableRectList")
        private java.util.List < TableRectList> tableRectList;

        @NameInMap("Text")
        private String text;

        private SubjectList(Builder builder) {
            this.answerPointsList = builder.answerPointsList;
            this.answerRectList = builder.answerRectList;
            this.confidence = builder.confidence;
            this.elements = builder.elements;
            this.figurePointsList = builder.figurePointsList;
            this.figureRectList = builder.figureRectList;
            this.index = builder.index;
            this.numChoices = builder.numChoices;
            this.subjectPointsList = builder.subjectPointsList;
            this.subjectRectList = builder.subjectRectList;
            this.subjectType = builder.subjectType;
            this.tablePointsList = builder.tablePointsList;
            this.tableRectList = builder.tableRectList;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubjectList create() {
            return builder().build();
        }

        /**
         * @return answerPointsList
         */
        public java.util.List < java.util.List < AnswerPointsList> > getAnswerPointsList() {
            return this.answerPointsList;
        }

        /**
         * @return answerRectList
         */
        public java.util.List < AnswerRectList> getAnswerRectList() {
            return this.answerRectList;
        }

        /**
         * @return confidence
         */
        public Integer getConfidence() {
            return this.confidence;
        }

        /**
         * @return elements
         */
        public java.util.List < Elements> getElements() {
            return this.elements;
        }

        /**
         * @return figurePointsList
         */
        public java.util.List < java.util.List < FigurePointsList> > getFigurePointsList() {
            return this.figurePointsList;
        }

        /**
         * @return figureRectList
         */
        public java.util.List < FigureRectList> getFigureRectList() {
            return this.figureRectList;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return numChoices
         */
        public Integer getNumChoices() {
            return this.numChoices;
        }

        /**
         * @return subjectPointsList
         */
        public java.util.List < java.util.List < SubjectPointsList> > getSubjectPointsList() {
            return this.subjectPointsList;
        }

        /**
         * @return subjectRectList
         */
        public java.util.List < SubjectRectList> getSubjectRectList() {
            return this.subjectRectList;
        }

        /**
         * @return subjectType
         */
        public Integer getSubjectType() {
            return this.subjectType;
        }

        /**
         * @return tablePointsList
         */
        public java.util.List < java.util.List < TablePointsList> > getTablePointsList() {
            return this.tablePointsList;
        }

        /**
         * @return tableRectList
         */
        public java.util.List < TableRectList> getTableRectList() {
            return this.tableRectList;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private java.util.List < java.util.List < AnswerPointsList> > answerPointsList; 
            private java.util.List < AnswerRectList> answerRectList; 
            private Integer confidence; 
            private java.util.List < Elements> elements; 
            private java.util.List < java.util.List < FigurePointsList> > figurePointsList; 
            private java.util.List < FigureRectList> figureRectList; 
            private Integer index; 
            private Integer numChoices; 
            private java.util.List < java.util.List < SubjectPointsList> > subjectPointsList; 
            private java.util.List < SubjectRectList> subjectRectList; 
            private Integer subjectType; 
            private java.util.List < java.util.List < TablePointsList> > tablePointsList; 
            private java.util.List < TableRectList> tableRectList; 
            private String text; 

            /**
             * AnswerPointsList.
             */
            public Builder answerPointsList(java.util.List < java.util.List < AnswerPointsList> > answerPointsList) {
                this.answerPointsList = answerPointsList;
                return this;
            }

            /**
             * AnswerRectList.
             */
            public Builder answerRectList(java.util.List < AnswerRectList> answerRectList) {
                this.answerRectList = answerRectList;
                return this;
            }

            /**
             * Confidence.
             */
            public Builder confidence(Integer confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * Elements.
             */
            public Builder elements(java.util.List < Elements> elements) {
                this.elements = elements;
                return this;
            }

            /**
             * FigurePointsList.
             */
            public Builder figurePointsList(java.util.List < java.util.List < FigurePointsList> > figurePointsList) {
                this.figurePointsList = figurePointsList;
                return this;
            }

            /**
             * FigureRectList.
             */
            public Builder figureRectList(java.util.List < FigureRectList> figureRectList) {
                this.figureRectList = figureRectList;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * NumChoices.
             */
            public Builder numChoices(Integer numChoices) {
                this.numChoices = numChoices;
                return this;
            }

            /**
             * SubjectPointsList.
             */
            public Builder subjectPointsList(java.util.List < java.util.List < SubjectPointsList> > subjectPointsList) {
                this.subjectPointsList = subjectPointsList;
                return this;
            }

            /**
             * SubjectRectList.
             */
            public Builder subjectRectList(java.util.List < SubjectRectList> subjectRectList) {
                this.subjectRectList = subjectRectList;
                return this;
            }

            /**
             * SubjectType.
             */
            public Builder subjectType(Integer subjectType) {
                this.subjectType = subjectType;
                return this;
            }

            /**
             * TablePointsList.
             */
            public Builder tablePointsList(java.util.List < java.util.List < TablePointsList> > tablePointsList) {
                this.tablePointsList = tablePointsList;
                return this;
            }

            /**
             * TableRectList.
             */
            public Builder tableRectList(java.util.List < TableRectList> tableRectList) {
                this.tableRectList = tableRectList;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public SubjectList build() {
                return new SubjectList(this);
            } 

        } 

    }
    public static class PartInfos extends TeaModel {
        @NameInMap("PartInfoPointsList")
        private java.util.List < java.util.List < PartInfoPointsList> > partInfoPointsList;

        @NameInMap("PartInfoRectList")
        private java.util.List < PartInfoRectList> partInfoRectList;

        @NameInMap("PartTitle")
        private String partTitle;

        @NameInMap("SubjectList")
        private java.util.List < SubjectList> subjectList;

        private PartInfos(Builder builder) {
            this.partInfoPointsList = builder.partInfoPointsList;
            this.partInfoRectList = builder.partInfoRectList;
            this.partTitle = builder.partTitle;
            this.subjectList = builder.subjectList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PartInfos create() {
            return builder().build();
        }

        /**
         * @return partInfoPointsList
         */
        public java.util.List < java.util.List < PartInfoPointsList> > getPartInfoPointsList() {
            return this.partInfoPointsList;
        }

        /**
         * @return partInfoRectList
         */
        public java.util.List < PartInfoRectList> getPartInfoRectList() {
            return this.partInfoRectList;
        }

        /**
         * @return partTitle
         */
        public String getPartTitle() {
            return this.partTitle;
        }

        /**
         * @return subjectList
         */
        public java.util.List < SubjectList> getSubjectList() {
            return this.subjectList;
        }

        public static final class Builder {
            private java.util.List < java.util.List < PartInfoPointsList> > partInfoPointsList; 
            private java.util.List < PartInfoRectList> partInfoRectList; 
            private String partTitle; 
            private java.util.List < SubjectList> subjectList; 

            /**
             * PartInfoPointsList.
             */
            public Builder partInfoPointsList(java.util.List < java.util.List < PartInfoPointsList> > partInfoPointsList) {
                this.partInfoPointsList = partInfoPointsList;
                return this;
            }

            /**
             * PartInfoRectList.
             */
            public Builder partInfoRectList(java.util.List < PartInfoRectList> partInfoRectList) {
                this.partInfoRectList = partInfoRectList;
                return this;
            }

            /**
             * PartTitle.
             */
            public Builder partTitle(String partTitle) {
                this.partTitle = partTitle;
                return this;
            }

            /**
             * SubjectList.
             */
            public Builder subjectList(java.util.List < SubjectList> subjectList) {
                this.subjectList = subjectList;
                return this;
            }

            public PartInfos build() {
                return new PartInfos(this);
            } 

        } 

    }
    public static class QrCodePoints extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private QrCodePoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QrCodePoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public QrCodePoints build() {
                return new QrCodePoints(this);
            } 

        } 

    }
    public static class QrCodeRect extends TeaModel {
        @NameInMap("CenterX")
        private Integer centerX;

        @NameInMap("CenterY")
        private Integer centerY;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private QrCodeRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QrCodeRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public QrCodeRect build() {
                return new QrCodeRect(this);
            } 

        } 

    }
    public static class QrCodeDetails extends TeaModel {
        @NameInMap("Angle")
        private Integer angle;

        @NameInMap("Data")
        private byte[] data;

        @NameInMap("QrCodePoints")
        private java.util.List < QrCodePoints> qrCodePoints;

        @NameInMap("QrCodeRect")
        private QrCodeRect qrCodeRect;

        @NameInMap("Type")
        private String type;

        private QrCodeDetails(Builder builder) {
            this.angle = builder.angle;
            this.data = builder.data;
            this.qrCodePoints = builder.qrCodePoints;
            this.qrCodeRect = builder.qrCodeRect;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QrCodeDetails create() {
            return builder().build();
        }

        /**
         * @return angle
         */
        public Integer getAngle() {
            return this.angle;
        }

        /**
         * @return data
         */
        public byte[] getData() {
            return this.data;
        }

        /**
         * @return qrCodePoints
         */
        public java.util.List < QrCodePoints> getQrCodePoints() {
            return this.qrCodePoints;
        }

        /**
         * @return qrCodeRect
         */
        public QrCodeRect getQrCodeRect() {
            return this.qrCodeRect;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer angle; 
            private byte[] data; 
            private java.util.List < QrCodePoints> qrCodePoints; 
            private QrCodeRect qrCodeRect; 
            private String type; 

            /**
             * Angle.
             */
            public Builder angle(Integer angle) {
                this.angle = angle;
                return this;
            }

            /**
             * Data.
             */
            public Builder data(byte[] data) {
                this.data = data;
                return this;
            }

            /**
             * QrCodePoints.
             */
            public Builder qrCodePoints(java.util.List < QrCodePoints> qrCodePoints) {
                this.qrCodePoints = qrCodePoints;
                return this;
            }

            /**
             * QrCodeRect.
             */
            public Builder qrCodeRect(QrCodeRect qrCodeRect) {
                this.qrCodeRect = qrCodeRect;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public QrCodeDetails build() {
                return new QrCodeDetails(this);
            } 

        } 

    }
    public static class QrCodeInfo extends TeaModel {
        @NameInMap("QrCodeCount")
        private Integer qrCodeCount;

        @NameInMap("QrCodeDetails")
        private java.util.List < QrCodeDetails> qrCodeDetails;

        private QrCodeInfo(Builder builder) {
            this.qrCodeCount = builder.qrCodeCount;
            this.qrCodeDetails = builder.qrCodeDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QrCodeInfo create() {
            return builder().build();
        }

        /**
         * @return qrCodeCount
         */
        public Integer getQrCodeCount() {
            return this.qrCodeCount;
        }

        /**
         * @return qrCodeDetails
         */
        public java.util.List < QrCodeDetails> getQrCodeDetails() {
            return this.qrCodeDetails;
        }

        public static final class Builder {
            private Integer qrCodeCount; 
            private java.util.List < QrCodeDetails> qrCodeDetails; 

            /**
             * QrCodeCount.
             */
            public Builder qrCodeCount(Integer qrCodeCount) {
                this.qrCodeCount = qrCodeCount;
                return this;
            }

            /**
             * QrCodeDetails.
             */
            public Builder qrCodeDetails(java.util.List < QrCodeDetails> qrCodeDetails) {
                this.qrCodeDetails = qrCodeDetails;
                return this;
            }

            public QrCodeInfo build() {
                return new QrCodeInfo(this);
            } 

        } 

    }
    public static class QualityInfo extends TeaModel {
        @NameInMap("CompletenessScore")
        private Float completenessScore;

        @NameInMap("IsCopy")
        private Boolean isCopy;

        @NameInMap("IsReshoot")
        private Boolean isReshoot;

        @NameInMap("QualityScore")
        private Float qualityScore;

        @NameInMap("TamperScore")
        private Float tamperScore;

        private QualityInfo(Builder builder) {
            this.completenessScore = builder.completenessScore;
            this.isCopy = builder.isCopy;
            this.isReshoot = builder.isReshoot;
            this.qualityScore = builder.qualityScore;
            this.tamperScore = builder.tamperScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QualityInfo create() {
            return builder().build();
        }

        /**
         * @return completenessScore
         */
        public Float getCompletenessScore() {
            return this.completenessScore;
        }

        /**
         * @return isCopy
         */
        public Boolean getIsCopy() {
            return this.isCopy;
        }

        /**
         * @return isReshoot
         */
        public Boolean getIsReshoot() {
            return this.isReshoot;
        }

        /**
         * @return qualityScore
         */
        public Float getQualityScore() {
            return this.qualityScore;
        }

        /**
         * @return tamperScore
         */
        public Float getTamperScore() {
            return this.tamperScore;
        }

        public static final class Builder {
            private Float completenessScore; 
            private Boolean isCopy; 
            private Boolean isReshoot; 
            private Float qualityScore; 
            private Float tamperScore; 

            /**
             * CompletenessScore.
             */
            public Builder completenessScore(Float completenessScore) {
                this.completenessScore = completenessScore;
                return this;
            }

            /**
             * IsCopy.
             */
            public Builder isCopy(Boolean isCopy) {
                this.isCopy = isCopy;
                return this;
            }

            /**
             * IsReshoot.
             */
            public Builder isReshoot(Boolean isReshoot) {
                this.isReshoot = isReshoot;
                return this;
            }

            /**
             * QualityScore.
             */
            public Builder qualityScore(Float qualityScore) {
                this.qualityScore = qualityScore;
                return this;
            }

            /**
             * TamperScore.
             */
            public Builder tamperScore(Float tamperScore) {
                this.tamperScore = tamperScore;
                return this;
            }

            public QualityInfo build() {
                return new QualityInfo(this);
            } 

        } 

    }
    public static class RowDetails extends TeaModel {
        @NameInMap("BlockList")
        private java.util.List < Integer > blockList;

        @NameInMap("RowContent")
        private String rowContent;

        @NameInMap("RowId")
        private Integer rowId;

        private RowDetails(Builder builder) {
            this.blockList = builder.blockList;
            this.rowContent = builder.rowContent;
            this.rowId = builder.rowId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RowDetails create() {
            return builder().build();
        }

        /**
         * @return blockList
         */
        public java.util.List < Integer > getBlockList() {
            return this.blockList;
        }

        /**
         * @return rowContent
         */
        public String getRowContent() {
            return this.rowContent;
        }

        /**
         * @return rowId
         */
        public Integer getRowId() {
            return this.rowId;
        }

        public static final class Builder {
            private java.util.List < Integer > blockList; 
            private String rowContent; 
            private Integer rowId; 

            /**
             * BlockList.
             */
            public Builder blockList(java.util.List < Integer > blockList) {
                this.blockList = blockList;
                return this;
            }

            /**
             * RowContent.
             */
            public Builder rowContent(String rowContent) {
                this.rowContent = rowContent;
                return this;
            }

            /**
             * RowId.
             */
            public Builder rowId(Integer rowId) {
                this.rowId = rowId;
                return this;
            }

            public RowDetails build() {
                return new RowDetails(this);
            } 

        } 

    }
    public static class RowInfo extends TeaModel {
        @NameInMap("RowCount")
        private Integer rowCount;

        @NameInMap("RowDetails")
        private java.util.List < RowDetails> rowDetails;

        private RowInfo(Builder builder) {
            this.rowCount = builder.rowCount;
            this.rowDetails = builder.rowDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RowInfo create() {
            return builder().build();
        }

        /**
         * @return rowCount
         */
        public Integer getRowCount() {
            return this.rowCount;
        }

        /**
         * @return rowDetails
         */
        public java.util.List < RowDetails> getRowDetails() {
            return this.rowDetails;
        }

        public static final class Builder {
            private Integer rowCount; 
            private java.util.List < RowDetails> rowDetails; 

            /**
             * RowCount.
             */
            public Builder rowCount(Integer rowCount) {
                this.rowCount = rowCount;
                return this;
            }

            /**
             * RowDetails.
             */
            public Builder rowDetails(java.util.List < RowDetails> rowDetails) {
                this.rowDetails = rowDetails;
                return this;
            }

            public RowInfo build() {
                return new RowInfo(this);
            } 

        } 

    }
    public static class StampDetailsData extends TeaModel {
        @NameInMap("AntiFakeCode")
        private String antiFakeCode;

        @NameInMap("CompanyId")
        private String companyId;

        @NameInMap("OrganizationName")
        private String organizationName;

        @NameInMap("OrganizationNameEng")
        private String organizationNameEng;

        @NameInMap("OtherText")
        private String otherText;

        @NameInMap("TaxpayerId")
        private String taxpayerId;

        @NameInMap("TopText")
        private String topText;

        private StampDetailsData(Builder builder) {
            this.antiFakeCode = builder.antiFakeCode;
            this.companyId = builder.companyId;
            this.organizationName = builder.organizationName;
            this.organizationNameEng = builder.organizationNameEng;
            this.otherText = builder.otherText;
            this.taxpayerId = builder.taxpayerId;
            this.topText = builder.topText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StampDetailsData create() {
            return builder().build();
        }

        /**
         * @return antiFakeCode
         */
        public String getAntiFakeCode() {
            return this.antiFakeCode;
        }

        /**
         * @return companyId
         */
        public String getCompanyId() {
            return this.companyId;
        }

        /**
         * @return organizationName
         */
        public String getOrganizationName() {
            return this.organizationName;
        }

        /**
         * @return organizationNameEng
         */
        public String getOrganizationNameEng() {
            return this.organizationNameEng;
        }

        /**
         * @return otherText
         */
        public String getOtherText() {
            return this.otherText;
        }

        /**
         * @return taxpayerId
         */
        public String getTaxpayerId() {
            return this.taxpayerId;
        }

        /**
         * @return topText
         */
        public String getTopText() {
            return this.topText;
        }

        public static final class Builder {
            private String antiFakeCode; 
            private String companyId; 
            private String organizationName; 
            private String organizationNameEng; 
            private String otherText; 
            private String taxpayerId; 
            private String topText; 

            /**
             * AntiFakeCode.
             */
            public Builder antiFakeCode(String antiFakeCode) {
                this.antiFakeCode = antiFakeCode;
                return this;
            }

            /**
             * CompanyId.
             */
            public Builder companyId(String companyId) {
                this.companyId = companyId;
                return this;
            }

            /**
             * OrganizationName.
             */
            public Builder organizationName(String organizationName) {
                this.organizationName = organizationName;
                return this;
            }

            /**
             * OrganizationNameEng.
             */
            public Builder organizationNameEng(String organizationNameEng) {
                this.organizationNameEng = organizationNameEng;
                return this;
            }

            /**
             * OtherText.
             */
            public Builder otherText(String otherText) {
                this.otherText = otherText;
                return this;
            }

            /**
             * TaxpayerId.
             */
            public Builder taxpayerId(String taxpayerId) {
                this.taxpayerId = taxpayerId;
                return this;
            }

            /**
             * TopText.
             */
            public Builder topText(String topText) {
                this.topText = topText;
                return this;
            }

            public StampDetailsData build() {
                return new StampDetailsData(this);
            } 

        } 

    }
    public static class StampPoints extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private StampPoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StampPoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public StampPoints build() {
                return new StampPoints(this);
            } 

        } 

    }
    public static class StampRect extends TeaModel {
        @NameInMap("CenterX")
        private Integer centerX;

        @NameInMap("CenterY")
        private Integer centerY;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private StampRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StampRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public StampRect build() {
                return new StampRect(this);
            } 

        } 

    }
    public static class StampDetails extends TeaModel {
        @NameInMap("Data")
        private StampDetailsData data;

        @NameInMap("StampAngle")
        private Integer stampAngle;

        @NameInMap("StampPoints")
        private java.util.List < StampPoints> stampPoints;

        @NameInMap("StampRect")
        private StampRect stampRect;

        private StampDetails(Builder builder) {
            this.data = builder.data;
            this.stampAngle = builder.stampAngle;
            this.stampPoints = builder.stampPoints;
            this.stampRect = builder.stampRect;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StampDetails create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public StampDetailsData getData() {
            return this.data;
        }

        /**
         * @return stampAngle
         */
        public Integer getStampAngle() {
            return this.stampAngle;
        }

        /**
         * @return stampPoints
         */
        public java.util.List < StampPoints> getStampPoints() {
            return this.stampPoints;
        }

        /**
         * @return stampRect
         */
        public StampRect getStampRect() {
            return this.stampRect;
        }

        public static final class Builder {
            private StampDetailsData data; 
            private Integer stampAngle; 
            private java.util.List < StampPoints> stampPoints; 
            private StampRect stampRect; 

            /**
             * Data.
             */
            public Builder data(StampDetailsData data) {
                this.data = data;
                return this;
            }

            /**
             * StampAngle.
             */
            public Builder stampAngle(Integer stampAngle) {
                this.stampAngle = stampAngle;
                return this;
            }

            /**
             * StampPoints.
             */
            public Builder stampPoints(java.util.List < StampPoints> stampPoints) {
                this.stampPoints = stampPoints;
                return this;
            }

            /**
             * StampRect.
             */
            public Builder stampRect(StampRect stampRect) {
                this.stampRect = stampRect;
                return this;
            }

            public StampDetails build() {
                return new StampDetails(this);
            } 

        } 

    }
    public static class StampInfo extends TeaModel {
        @NameInMap("StampCount")
        private Integer stampCount;

        @NameInMap("StampDetails")
        private java.util.List < StampDetails> stampDetails;

        private StampInfo(Builder builder) {
            this.stampCount = builder.stampCount;
            this.stampDetails = builder.stampDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StampInfo create() {
            return builder().build();
        }

        /**
         * @return stampCount
         */
        public Integer getStampCount() {
            return this.stampCount;
        }

        /**
         * @return stampDetails
         */
        public java.util.List < StampDetails> getStampDetails() {
            return this.stampDetails;
        }

        public static final class Builder {
            private Integer stampCount; 
            private java.util.List < StampDetails> stampDetails; 

            /**
             * StampCount.
             */
            public Builder stampCount(Integer stampCount) {
                this.stampCount = stampCount;
                return this;
            }

            /**
             * StampDetails.
             */
            public Builder stampDetails(java.util.List < StampDetails> stampDetails) {
                this.stampDetails = stampDetails;
                return this;
            }

            public StampInfo build() {
                return new StampInfo(this);
            } 

        } 

    }
    public static class SubImagePoints extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private SubImagePoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubImagePoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public SubImagePoints build() {
                return new SubImagePoints(this);
            } 

        } 

    }
    public static class SubImageRect extends TeaModel {
        @NameInMap("CenterX")
        private Integer centerX;

        @NameInMap("CenterY")
        private Integer centerY;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private SubImageRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubImageRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public SubImageRect build() {
                return new SubImageRect(this);
            } 

        } 

    }
    public static class CellPoints extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private CellPoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CellPoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public CellPoints build() {
                return new CellPoints(this);
            } 

        } 

    }
    public static class CellRect extends TeaModel {
        @NameInMap("CenterX")
        private Integer centerX;

        @NameInMap("CenterY")
        private Integer centerY;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private CellRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CellRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public CellRect build() {
                return new CellRect(this);
            } 

        } 

    }
    public static class CellDetails extends TeaModel {
        @NameInMap("BlockList")
        private java.util.List < Integer > blockList;

        @NameInMap("CellAngle")
        private Integer cellAngle;

        @NameInMap("CellContent")
        private String cellContent;

        @NameInMap("CellId")
        private Integer cellId;

        @NameInMap("CellPoints")
        private java.util.List < CellPoints> cellPoints;

        @NameInMap("CellRect")
        private CellRect cellRect;

        @NameInMap("ColumnEnd")
        private Integer columnEnd;

        @NameInMap("ColumnStart")
        private Integer columnStart;

        @NameInMap("RowEnd")
        private Integer rowEnd;

        @NameInMap("RowStart")
        private Integer rowStart;

        private CellDetails(Builder builder) {
            this.blockList = builder.blockList;
            this.cellAngle = builder.cellAngle;
            this.cellContent = builder.cellContent;
            this.cellId = builder.cellId;
            this.cellPoints = builder.cellPoints;
            this.cellRect = builder.cellRect;
            this.columnEnd = builder.columnEnd;
            this.columnStart = builder.columnStart;
            this.rowEnd = builder.rowEnd;
            this.rowStart = builder.rowStart;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CellDetails create() {
            return builder().build();
        }

        /**
         * @return blockList
         */
        public java.util.List < Integer > getBlockList() {
            return this.blockList;
        }

        /**
         * @return cellAngle
         */
        public Integer getCellAngle() {
            return this.cellAngle;
        }

        /**
         * @return cellContent
         */
        public String getCellContent() {
            return this.cellContent;
        }

        /**
         * @return cellId
         */
        public Integer getCellId() {
            return this.cellId;
        }

        /**
         * @return cellPoints
         */
        public java.util.List < CellPoints> getCellPoints() {
            return this.cellPoints;
        }

        /**
         * @return cellRect
         */
        public CellRect getCellRect() {
            return this.cellRect;
        }

        /**
         * @return columnEnd
         */
        public Integer getColumnEnd() {
            return this.columnEnd;
        }

        /**
         * @return columnStart
         */
        public Integer getColumnStart() {
            return this.columnStart;
        }

        /**
         * @return rowEnd
         */
        public Integer getRowEnd() {
            return this.rowEnd;
        }

        /**
         * @return rowStart
         */
        public Integer getRowStart() {
            return this.rowStart;
        }

        public static final class Builder {
            private java.util.List < Integer > blockList; 
            private Integer cellAngle; 
            private String cellContent; 
            private Integer cellId; 
            private java.util.List < CellPoints> cellPoints; 
            private CellRect cellRect; 
            private Integer columnEnd; 
            private Integer columnStart; 
            private Integer rowEnd; 
            private Integer rowStart; 

            /**
             * BlockList.
             */
            public Builder blockList(java.util.List < Integer > blockList) {
                this.blockList = blockList;
                return this;
            }

            /**
             * CellAngle.
             */
            public Builder cellAngle(Integer cellAngle) {
                this.cellAngle = cellAngle;
                return this;
            }

            /**
             * CellContent.
             */
            public Builder cellContent(String cellContent) {
                this.cellContent = cellContent;
                return this;
            }

            /**
             * CellId.
             */
            public Builder cellId(Integer cellId) {
                this.cellId = cellId;
                return this;
            }

            /**
             * CellPoints.
             */
            public Builder cellPoints(java.util.List < CellPoints> cellPoints) {
                this.cellPoints = cellPoints;
                return this;
            }

            /**
             * CellRect.
             */
            public Builder cellRect(CellRect cellRect) {
                this.cellRect = cellRect;
                return this;
            }

            /**
             * ColumnEnd.
             */
            public Builder columnEnd(Integer columnEnd) {
                this.columnEnd = columnEnd;
                return this;
            }

            /**
             * ColumnStart.
             */
            public Builder columnStart(Integer columnStart) {
                this.columnStart = columnStart;
                return this;
            }

            /**
             * RowEnd.
             */
            public Builder rowEnd(Integer rowEnd) {
                this.rowEnd = rowEnd;
                return this;
            }

            /**
             * RowStart.
             */
            public Builder rowStart(Integer rowStart) {
                this.rowStart = rowStart;
                return this;
            }

            public CellDetails build() {
                return new CellDetails(this);
            } 

        } 

    }
    public static class Points extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private Points(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Points create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public Points build() {
                return new Points(this);
            } 

        } 

    }
    public static class Footer extends TeaModel {
        @NameInMap("BlockId")
        private Integer blockId;

        @NameInMap("Contents")
        private java.util.List < String > contents;

        @NameInMap("Points")
        private java.util.List < Points> points;

        private Footer(Builder builder) {
            this.blockId = builder.blockId;
            this.contents = builder.contents;
            this.points = builder.points;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Footer create() {
            return builder().build();
        }

        /**
         * @return blockId
         */
        public Integer getBlockId() {
            return this.blockId;
        }

        /**
         * @return contents
         */
        public java.util.List < String > getContents() {
            return this.contents;
        }

        /**
         * @return points
         */
        public java.util.List < Points> getPoints() {
            return this.points;
        }

        public static final class Builder {
            private Integer blockId; 
            private java.util.List < String > contents; 
            private java.util.List < Points> points; 

            /**
             * BlockId.
             */
            public Builder blockId(Integer blockId) {
                this.blockId = blockId;
                return this;
            }

            /**
             * Contents.
             */
            public Builder contents(java.util.List < String > contents) {
                this.contents = contents;
                return this;
            }

            /**
             * Points.
             */
            public Builder points(java.util.List < Points> points) {
                this.points = points;
                return this;
            }

            public Footer build() {
                return new Footer(this);
            } 

        } 

    }
    public static class HeaderPoints extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private HeaderPoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HeaderPoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public HeaderPoints build() {
                return new HeaderPoints(this);
            } 

        } 

    }
    public static class TableDetailsHeader extends TeaModel {
        @NameInMap("BlockId")
        private Integer blockId;

        @NameInMap("Contents")
        private java.util.List < String > contents;

        @NameInMap("Points")
        private java.util.List < HeaderPoints> points;

        private TableDetailsHeader(Builder builder) {
            this.blockId = builder.blockId;
            this.contents = builder.contents;
            this.points = builder.points;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableDetailsHeader create() {
            return builder().build();
        }

        /**
         * @return blockId
         */
        public Integer getBlockId() {
            return this.blockId;
        }

        /**
         * @return contents
         */
        public java.util.List < String > getContents() {
            return this.contents;
        }

        /**
         * @return points
         */
        public java.util.List < HeaderPoints> getPoints() {
            return this.points;
        }

        public static final class Builder {
            private Integer blockId; 
            private java.util.List < String > contents; 
            private java.util.List < HeaderPoints> points; 

            /**
             * BlockId.
             */
            public Builder blockId(Integer blockId) {
                this.blockId = blockId;
                return this;
            }

            /**
             * Contents.
             */
            public Builder contents(java.util.List < String > contents) {
                this.contents = contents;
                return this;
            }

            /**
             * Points.
             */
            public Builder points(java.util.List < HeaderPoints> points) {
                this.points = points;
                return this;
            }

            public TableDetailsHeader build() {
                return new TableDetailsHeader(this);
            } 

        } 

    }
    public static class TablePoints extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private TablePoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TablePoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public TablePoints build() {
                return new TablePoints(this);
            } 

        } 

    }
    public static class TableRect extends TeaModel {
        @NameInMap("CenterX")
        private Integer centerX;

        @NameInMap("CenterY")
        private Integer centerY;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private TableRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer height; 
            private Integer width; 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public TableRect build() {
                return new TableRect(this);
            } 

        } 

    }
    public static class TableDetails extends TeaModel {
        @NameInMap("CellCount")
        private Integer cellCount;

        @NameInMap("CellDetails")
        private java.util.List < CellDetails> cellDetails;

        @NameInMap("ColumnCount")
        private Integer columnCount;

        @NameInMap("Footer")
        private Footer footer;

        @NameInMap("Header")
        private TableDetailsHeader header;

        @NameInMap("RowCount")
        private Integer rowCount;

        @NameInMap("TableId")
        private Integer tableId;

        @NameInMap("TablePoints")
        private java.util.List < TablePoints> tablePoints;

        @NameInMap("TableRect")
        private TableRect tableRect;

        private TableDetails(Builder builder) {
            this.cellCount = builder.cellCount;
            this.cellDetails = builder.cellDetails;
            this.columnCount = builder.columnCount;
            this.footer = builder.footer;
            this.header = builder.header;
            this.rowCount = builder.rowCount;
            this.tableId = builder.tableId;
            this.tablePoints = builder.tablePoints;
            this.tableRect = builder.tableRect;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableDetails create() {
            return builder().build();
        }

        /**
         * @return cellCount
         */
        public Integer getCellCount() {
            return this.cellCount;
        }

        /**
         * @return cellDetails
         */
        public java.util.List < CellDetails> getCellDetails() {
            return this.cellDetails;
        }

        /**
         * @return columnCount
         */
        public Integer getColumnCount() {
            return this.columnCount;
        }

        /**
         * @return footer
         */
        public Footer getFooter() {
            return this.footer;
        }

        /**
         * @return header
         */
        public TableDetailsHeader getHeader() {
            return this.header;
        }

        /**
         * @return rowCount
         */
        public Integer getRowCount() {
            return this.rowCount;
        }

        /**
         * @return tableId
         */
        public Integer getTableId() {
            return this.tableId;
        }

        /**
         * @return tablePoints
         */
        public java.util.List < TablePoints> getTablePoints() {
            return this.tablePoints;
        }

        /**
         * @return tableRect
         */
        public TableRect getTableRect() {
            return this.tableRect;
        }

        public static final class Builder {
            private Integer cellCount; 
            private java.util.List < CellDetails> cellDetails; 
            private Integer columnCount; 
            private Footer footer; 
            private TableDetailsHeader header; 
            private Integer rowCount; 
            private Integer tableId; 
            private java.util.List < TablePoints> tablePoints; 
            private TableRect tableRect; 

            /**
             * CellCount.
             */
            public Builder cellCount(Integer cellCount) {
                this.cellCount = cellCount;
                return this;
            }

            /**
             * CellDetails.
             */
            public Builder cellDetails(java.util.List < CellDetails> cellDetails) {
                this.cellDetails = cellDetails;
                return this;
            }

            /**
             * ColumnCount.
             */
            public Builder columnCount(Integer columnCount) {
                this.columnCount = columnCount;
                return this;
            }

            /**
             * Footer.
             */
            public Builder footer(Footer footer) {
                this.footer = footer;
                return this;
            }

            /**
             * Header.
             */
            public Builder header(TableDetailsHeader header) {
                this.header = header;
                return this;
            }

            /**
             * RowCount.
             */
            public Builder rowCount(Integer rowCount) {
                this.rowCount = rowCount;
                return this;
            }

            /**
             * TableId.
             */
            public Builder tableId(Integer tableId) {
                this.tableId = tableId;
                return this;
            }

            /**
             * TablePoints.
             */
            public Builder tablePoints(java.util.List < TablePoints> tablePoints) {
                this.tablePoints = tablePoints;
                return this;
            }

            /**
             * TableRect.
             */
            public Builder tableRect(TableRect tableRect) {
                this.tableRect = tableRect;
                return this;
            }

            public TableDetails build() {
                return new TableDetails(this);
            } 

        } 

    }
    public static class TableInfo extends TeaModel {
        @NameInMap("TableCount")
        private Integer tableCount;

        @NameInMap("TableDetails")
        private java.util.List < TableDetails> tableDetails;

        @NameInMap("TableExcel")
        private String tableExcel;

        @NameInMap("TableHtml")
        private String tableHtml;

        private TableInfo(Builder builder) {
            this.tableCount = builder.tableCount;
            this.tableDetails = builder.tableDetails;
            this.tableExcel = builder.tableExcel;
            this.tableHtml = builder.tableHtml;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableInfo create() {
            return builder().build();
        }

        /**
         * @return tableCount
         */
        public Integer getTableCount() {
            return this.tableCount;
        }

        /**
         * @return tableDetails
         */
        public java.util.List < TableDetails> getTableDetails() {
            return this.tableDetails;
        }

        /**
         * @return tableExcel
         */
        public String getTableExcel() {
            return this.tableExcel;
        }

        /**
         * @return tableHtml
         */
        public String getTableHtml() {
            return this.tableHtml;
        }

        public static final class Builder {
            private Integer tableCount; 
            private java.util.List < TableDetails> tableDetails; 
            private String tableExcel; 
            private String tableHtml; 

            /**
             * TableCount.
             */
            public Builder tableCount(Integer tableCount) {
                this.tableCount = tableCount;
                return this;
            }

            /**
             * TableDetails.
             */
            public Builder tableDetails(java.util.List < TableDetails> tableDetails) {
                this.tableDetails = tableDetails;
                return this;
            }

            /**
             * TableExcel.
             */
            public Builder tableExcel(String tableExcel) {
                this.tableExcel = tableExcel;
                return this;
            }

            /**
             * TableHtml.
             */
            public Builder tableHtml(String tableHtml) {
                this.tableHtml = tableHtml;
                return this;
            }

            public TableInfo build() {
                return new TableInfo(this);
            } 

        } 

    }
    public static class SubImages extends TeaModel {
        @NameInMap("Angle")
        private Integer angle;

        @NameInMap("BarCodeInfo")
        private BarCodeInfo barCodeInfo;

        @NameInMap("BlockInfo")
        private BlockInfo blockInfo;

        @NameInMap("DocLayouts")
        private java.util.List < DocLayouts> docLayouts;

        @NameInMap("DocSpecialTexts")
        private java.util.List < DocSpecialTexts> docSpecialTexts;

        @NameInMap("DocSubField")
        private java.util.List < DocSubField> docSubField;

        @NameInMap("FigureInfo")
        private java.util.Map < String, DataSubImagesFigureInfoValue > figureInfo;

        @NameInMap("KvInfo")
        private KvInfo kvInfo;

        @NameInMap("MathInfos")
        private java.util.List < MathInfos> mathInfos;

        @NameInMap("NewStyleData")
        private NewStyleData newStyleData;

        @NameInMap("PageId")
        private Integer pageId;

        @NameInMap("PageInfos")
        private java.util.List < PageInfos> pageInfos;

        @NameInMap("PageTitle")
        private String pageTitle;

        @NameInMap("ParagraphInfo")
        private ParagraphInfo paragraphInfo;

        @NameInMap("PartInfos")
        private java.util.List < PartInfos> partInfos;

        @NameInMap("QrCodeInfo")
        private QrCodeInfo qrCodeInfo;

        @NameInMap("QualityInfo")
        private QualityInfo qualityInfo;

        @NameInMap("RowInfo")
        private RowInfo rowInfo;

        @NameInMap("StampInfo")
        private StampInfo stampInfo;

        @NameInMap("SubImageId")
        private Integer subImageId;

        @NameInMap("SubImagePoints")
        private java.util.List < SubImagePoints> subImagePoints;

        @NameInMap("SubImageRect")
        private SubImageRect subImageRect;

        @NameInMap("TableInfo")
        private TableInfo tableInfo;

        @NameInMap("Type")
        private String type;

        private SubImages(Builder builder) {
            this.angle = builder.angle;
            this.barCodeInfo = builder.barCodeInfo;
            this.blockInfo = builder.blockInfo;
            this.docLayouts = builder.docLayouts;
            this.docSpecialTexts = builder.docSpecialTexts;
            this.docSubField = builder.docSubField;
            this.figureInfo = builder.figureInfo;
            this.kvInfo = builder.kvInfo;
            this.mathInfos = builder.mathInfos;
            this.newStyleData = builder.newStyleData;
            this.pageId = builder.pageId;
            this.pageInfos = builder.pageInfos;
            this.pageTitle = builder.pageTitle;
            this.paragraphInfo = builder.paragraphInfo;
            this.partInfos = builder.partInfos;
            this.qrCodeInfo = builder.qrCodeInfo;
            this.qualityInfo = builder.qualityInfo;
            this.rowInfo = builder.rowInfo;
            this.stampInfo = builder.stampInfo;
            this.subImageId = builder.subImageId;
            this.subImagePoints = builder.subImagePoints;
            this.subImageRect = builder.subImageRect;
            this.tableInfo = builder.tableInfo;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubImages create() {
            return builder().build();
        }

        /**
         * @return angle
         */
        public Integer getAngle() {
            return this.angle;
        }

        /**
         * @return barCodeInfo
         */
        public BarCodeInfo getBarCodeInfo() {
            return this.barCodeInfo;
        }

        /**
         * @return blockInfo
         */
        public BlockInfo getBlockInfo() {
            return this.blockInfo;
        }

        /**
         * @return docLayouts
         */
        public java.util.List < DocLayouts> getDocLayouts() {
            return this.docLayouts;
        }

        /**
         * @return docSpecialTexts
         */
        public java.util.List < DocSpecialTexts> getDocSpecialTexts() {
            return this.docSpecialTexts;
        }

        /**
         * @return docSubField
         */
        public java.util.List < DocSubField> getDocSubField() {
            return this.docSubField;
        }

        /**
         * @return figureInfo
         */
        public java.util.Map < String, DataSubImagesFigureInfoValue > getFigureInfo() {
            return this.figureInfo;
        }

        /**
         * @return kvInfo
         */
        public KvInfo getKvInfo() {
            return this.kvInfo;
        }

        /**
         * @return mathInfos
         */
        public java.util.List < MathInfos> getMathInfos() {
            return this.mathInfos;
        }

        /**
         * @return newStyleData
         */
        public NewStyleData getNewStyleData() {
            return this.newStyleData;
        }

        /**
         * @return pageId
         */
        public Integer getPageId() {
            return this.pageId;
        }

        /**
         * @return pageInfos
         */
        public java.util.List < PageInfos> getPageInfos() {
            return this.pageInfos;
        }

        /**
         * @return pageTitle
         */
        public String getPageTitle() {
            return this.pageTitle;
        }

        /**
         * @return paragraphInfo
         */
        public ParagraphInfo getParagraphInfo() {
            return this.paragraphInfo;
        }

        /**
         * @return partInfos
         */
        public java.util.List < PartInfos> getPartInfos() {
            return this.partInfos;
        }

        /**
         * @return qrCodeInfo
         */
        public QrCodeInfo getQrCodeInfo() {
            return this.qrCodeInfo;
        }

        /**
         * @return qualityInfo
         */
        public QualityInfo getQualityInfo() {
            return this.qualityInfo;
        }

        /**
         * @return rowInfo
         */
        public RowInfo getRowInfo() {
            return this.rowInfo;
        }

        /**
         * @return stampInfo
         */
        public StampInfo getStampInfo() {
            return this.stampInfo;
        }

        /**
         * @return subImageId
         */
        public Integer getSubImageId() {
            return this.subImageId;
        }

        /**
         * @return subImagePoints
         */
        public java.util.List < SubImagePoints> getSubImagePoints() {
            return this.subImagePoints;
        }

        /**
         * @return subImageRect
         */
        public SubImageRect getSubImageRect() {
            return this.subImageRect;
        }

        /**
         * @return tableInfo
         */
        public TableInfo getTableInfo() {
            return this.tableInfo;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer angle; 
            private BarCodeInfo barCodeInfo; 
            private BlockInfo blockInfo; 
            private java.util.List < DocLayouts> docLayouts; 
            private java.util.List < DocSpecialTexts> docSpecialTexts; 
            private java.util.List < DocSubField> docSubField; 
            private java.util.Map < String, DataSubImagesFigureInfoValue > figureInfo; 
            private KvInfo kvInfo; 
            private java.util.List < MathInfos> mathInfos; 
            private NewStyleData newStyleData; 
            private Integer pageId; 
            private java.util.List < PageInfos> pageInfos; 
            private String pageTitle; 
            private ParagraphInfo paragraphInfo; 
            private java.util.List < PartInfos> partInfos; 
            private QrCodeInfo qrCodeInfo; 
            private QualityInfo qualityInfo; 
            private RowInfo rowInfo; 
            private StampInfo stampInfo; 
            private Integer subImageId; 
            private java.util.List < SubImagePoints> subImagePoints; 
            private SubImageRect subImageRect; 
            private TableInfo tableInfo; 
            private String type; 

            /**
             * Angle.
             */
            public Builder angle(Integer angle) {
                this.angle = angle;
                return this;
            }

            /**
             * BarCodeInfo.
             */
            public Builder barCodeInfo(BarCodeInfo barCodeInfo) {
                this.barCodeInfo = barCodeInfo;
                return this;
            }

            /**
             * BlockInfo.
             */
            public Builder blockInfo(BlockInfo blockInfo) {
                this.blockInfo = blockInfo;
                return this;
            }

            /**
             * DocLayouts.
             */
            public Builder docLayouts(java.util.List < DocLayouts> docLayouts) {
                this.docLayouts = docLayouts;
                return this;
            }

            /**
             * DocSpecialTexts.
             */
            public Builder docSpecialTexts(java.util.List < DocSpecialTexts> docSpecialTexts) {
                this.docSpecialTexts = docSpecialTexts;
                return this;
            }

            /**
             * DocSubField.
             */
            public Builder docSubField(java.util.List < DocSubField> docSubField) {
                this.docSubField = docSubField;
                return this;
            }

            /**
             * FigureInfo.
             */
            public Builder figureInfo(java.util.Map < String, DataSubImagesFigureInfoValue > figureInfo) {
                this.figureInfo = figureInfo;
                return this;
            }

            /**
             * KvInfo.
             */
            public Builder kvInfo(KvInfo kvInfo) {
                this.kvInfo = kvInfo;
                return this;
            }

            /**
             * MathInfos.
             */
            public Builder mathInfos(java.util.List < MathInfos> mathInfos) {
                this.mathInfos = mathInfos;
                return this;
            }

            /**
             * NewStyleData.
             */
            public Builder newStyleData(NewStyleData newStyleData) {
                this.newStyleData = newStyleData;
                return this;
            }

            /**
             * PageId.
             */
            public Builder pageId(Integer pageId) {
                this.pageId = pageId;
                return this;
            }

            /**
             * PageInfos.
             */
            public Builder pageInfos(java.util.List < PageInfos> pageInfos) {
                this.pageInfos = pageInfos;
                return this;
            }

            /**
             * PageTitle.
             */
            public Builder pageTitle(String pageTitle) {
                this.pageTitle = pageTitle;
                return this;
            }

            /**
             * ParagraphInfo.
             */
            public Builder paragraphInfo(ParagraphInfo paragraphInfo) {
                this.paragraphInfo = paragraphInfo;
                return this;
            }

            /**
             * PartInfos.
             */
            public Builder partInfos(java.util.List < PartInfos> partInfos) {
                this.partInfos = partInfos;
                return this;
            }

            /**
             * QrCodeInfo.
             */
            public Builder qrCodeInfo(QrCodeInfo qrCodeInfo) {
                this.qrCodeInfo = qrCodeInfo;
                return this;
            }

            /**
             * QualityInfo.
             */
            public Builder qualityInfo(QualityInfo qualityInfo) {
                this.qualityInfo = qualityInfo;
                return this;
            }

            /**
             * RowInfo.
             */
            public Builder rowInfo(RowInfo rowInfo) {
                this.rowInfo = rowInfo;
                return this;
            }

            /**
             * StampInfo.
             */
            public Builder stampInfo(StampInfo stampInfo) {
                this.stampInfo = stampInfo;
                return this;
            }

            /**
             * SubImageId.
             */
            public Builder subImageId(Integer subImageId) {
                this.subImageId = subImageId;
                return this;
            }

            /**
             * SubImagePoints.
             */
            public Builder subImagePoints(java.util.List < SubImagePoints> subImagePoints) {
                this.subImagePoints = subImagePoints;
                return this;
            }

            /**
             * SubImageRect.
             */
            public Builder subImageRect(SubImageRect subImageRect) {
                this.subImageRect = subImageRect;
                return this;
            }

            /**
             * TableInfo.
             */
            public Builder tableInfo(TableInfo tableInfo) {
                this.tableInfo = tableInfo;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SubImages build() {
                return new SubImages(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AlgoServer")
        private java.util.List < String > algoServer;

        @NameInMap("AlgoVersion")
        private String algoVersion;

        @NameInMap("Content")
        private String content;

        @NameInMap("DebugInfo")
        private Object debugInfo;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("IsMixedMode")
        private Boolean isMixedMode;

        @NameInMap("KvExcelUrl")
        private String kvExcelUrl;

        @NameInMap("PageNo")
        private Integer pageNo;

        @NameInMap("SubImageCount")
        private Integer subImageCount;

        @NameInMap("SubImages")
        private java.util.List < SubImages> subImages;

        @NameInMap("Width")
        private Integer width;

        @NameInMap("XmlResult")
        private String xmlResult;

        private Data(Builder builder) {
            this.algoServer = builder.algoServer;
            this.algoVersion = builder.algoVersion;
            this.content = builder.content;
            this.debugInfo = builder.debugInfo;
            this.height = builder.height;
            this.isMixedMode = builder.isMixedMode;
            this.kvExcelUrl = builder.kvExcelUrl;
            this.pageNo = builder.pageNo;
            this.subImageCount = builder.subImageCount;
            this.subImages = builder.subImages;
            this.width = builder.width;
            this.xmlResult = builder.xmlResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return algoServer
         */
        public java.util.List < String > getAlgoServer() {
            return this.algoServer;
        }

        /**
         * @return algoVersion
         */
        public String getAlgoVersion() {
            return this.algoVersion;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return debugInfo
         */
        public Object getDebugInfo() {
            return this.debugInfo;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return isMixedMode
         */
        public Boolean getIsMixedMode() {
            return this.isMixedMode;
        }

        /**
         * @return kvExcelUrl
         */
        public String getKvExcelUrl() {
            return this.kvExcelUrl;
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return subImageCount
         */
        public Integer getSubImageCount() {
            return this.subImageCount;
        }

        /**
         * @return subImages
         */
        public java.util.List < SubImages> getSubImages() {
            return this.subImages;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        /**
         * @return xmlResult
         */
        public String getXmlResult() {
            return this.xmlResult;
        }

        public static final class Builder {
            private java.util.List < String > algoServer; 
            private String algoVersion; 
            private String content; 
            private Object debugInfo; 
            private Integer height; 
            private Boolean isMixedMode; 
            private String kvExcelUrl; 
            private Integer pageNo; 
            private Integer subImageCount; 
            private java.util.List < SubImages> subImages; 
            private Integer width; 
            private String xmlResult; 

            /**
             * AlgoServer.
             */
            public Builder algoServer(java.util.List < String > algoServer) {
                this.algoServer = algoServer;
                return this;
            }

            /**
             * AlgoVersion.
             */
            public Builder algoVersion(String algoVersion) {
                this.algoVersion = algoVersion;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * DebugInfo.
             */
            public Builder debugInfo(Object debugInfo) {
                this.debugInfo = debugInfo;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * IsMixedMode.
             */
            public Builder isMixedMode(Boolean isMixedMode) {
                this.isMixedMode = isMixedMode;
                return this;
            }

            /**
             * KvExcelUrl.
             */
            public Builder kvExcelUrl(String kvExcelUrl) {
                this.kvExcelUrl = kvExcelUrl;
                return this;
            }

            /**
             * PageNo.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * SubImageCount.
             */
            public Builder subImageCount(Integer subImageCount) {
                this.subImageCount = subImageCount;
                return this;
            }

            /**
             * SubImages.
             */
            public Builder subImages(java.util.List < SubImages> subImages) {
                this.subImages = subImages;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            /**
             * XmlResult.
             */
            public Builder xmlResult(String xmlResult) {
                this.xmlResult = xmlResult;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
